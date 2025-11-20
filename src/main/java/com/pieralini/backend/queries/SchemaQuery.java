package com.pieralini.backend.queries;

import com.pieralini.backend.utils.SqlRunner;
import org.springframework.stereotype.Component;

@Component
public class SchemaQuery {

    private final SqlRunner sqlRunner;

    private SchemaQuery(SqlRunner sqlRunner) {
        this.sqlRunner = sqlRunner;
    }

    public void createSchema() {

        String sql = """
        CREATE DATABASE IF NOT EXISTS backend_db;
    
        USE backend_db;
    
        CREATE TABLE IF NOT EXISTS funcionario (
            id BIGINT NOT NULL AUTO_INCREMENT,
            nome VARCHAR(255),
            cargo VARCHAR(255),
    
            -- Dados pessoais
            cpf VARCHAR(20),
            rg VARCHAR(20),
            data_nascimento DATE,
            
            -- Contato
            email VARCHAR(255),
            telefone VARCHAR(50),
            
            -- Profissional
            salario DECIMAL(10,2),
            beneficios DECIMAL(10,2),
            formacao VARCHAR(255),
            cursos TEXT,
            data_contratacao DATE,
            data_demissao DATE,
            tipo_contrato VARCHAR(100),
            
            -- Endereço
            endereco VARCHAR(255),
            cidade VARCHAR(150),
            estado VARCHAR(50),
            cep VARCHAR(20),
    
            PRIMARY KEY(id)
        );
    
        CREATE TABLE IF NOT EXISTS usuario (
            id BIGINT NOT NULL AUTO_INCREMENT,
            email VARCHAR(255),
            senha VARCHAR(255),
    
            -- Relacionamento com funcionário
            id_funcionario BIGINT,
            
            PRIMARY KEY(id),
            FOREIGN KEY (id_funcionario) REFERENCES funcionario(id)
                ON UPDATE CASCADE
                ON DELETE SET NULL
        );
    """;


        sqlRunner.RunSql(sql);
    }
}
