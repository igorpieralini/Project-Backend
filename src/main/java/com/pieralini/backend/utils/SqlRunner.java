package com.pieralini.backend.utils;

import com.pieralini.backend.config.DbConnectionManager;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SqlRunner {

    private final ResourceLoader loader;
    private final DbConnectionManager dbManager;

    public SqlRunner(ResourceLoader loader, DbConnectionManager dbManager) {
        this.loader = loader;
        this.dbManager = dbManager;
    }

    public void RunSql(String path) {
        try {
            Resource resource = loader.getResource("classpath:" + path);
            String sql = Files.readString(resource.getFile().toPath(), StandardCharsets.UTF_8);

            Connection conn = dbManager.getConnection();
            if (conn == null) {
                System.err.println("❌ Não foi possível obter conexão. SQL não executado: " + path);
                return;
            }

            try (Statement stmt = conn.createStatement()) {
                String[] queries = sql.split(";");
                for (String query : queries) {
                    query = query.trim();
                    if (!query.isEmpty()) {
                        stmt.execute(query);
                    }
                }
            }

            System.out.println("✔ Queries executadas: " + path);

        } catch (Exception e) {
            System.err.println("❌ Erro executando SQL: " + path);
            e.printStackTrace();
        }
    }

    public List<Map<String, Object>> ReturnSqlFromQuery(String sql, Object... params) {
        List<Map<String, Object>> results = new ArrayList<>();

        try (Connection conn = dbManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }

            try (ResultSet rs = stmt.executeQuery()) {
                ResultSetMetaData meta = rs.getMetaData();
                int columnCount = meta.getColumnCount();

                while (rs.next()) {
                    Map<String, Object> row = new HashMap<>();
                    for (int i = 1; i <= columnCount; i++) {
                        row.put(meta.getColumnName(i), rs.getObject(i));
                    }
                    results.add(row);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }


}
