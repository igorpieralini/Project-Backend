package com.pieralini.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbConnectionManager {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    public Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✔ Conexão com o banco estabelecida com sucesso!");
            return conn;
        } catch (SQLException e) {
            System.err.println("❌ Erro ao conectar no banco: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
