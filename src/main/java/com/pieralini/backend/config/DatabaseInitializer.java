package com.pieralini.backend.config;

import com.pieralini.backend.queries.SchemaQuery;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    private final SchemaQuery schemaQuery;

    private DatabaseInitializer(SchemaQuery schemaQuery) {
        this.schemaQuery = schemaQuery;
    }

    @PostConstruct
    public void initDatabase() {
        schemaQuery.createSchema();
    }
}
