package com.pieralini.backend.config;

import com.pieralini.backend.utils.SqlRunner;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    private final SqlRunner sqlRunner;

    public DatabaseInitializer(SqlRunner sqlRunner) {
        this.sqlRunner = sqlRunner;
    }

    @PostConstruct
    public void initDatabase() {
        sqlRunner.RunSql("database/schema/create_database.sql");
        sqlRunner.RunSql("database/schema/create_tables.sql");
    }
}
