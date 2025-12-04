package com.pieralini.backend.queries;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.utils.SqlRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertFuncionarioQuery {

    private final SqlRunner sqlRunner;

    public InsertFuncionarioQuery(SqlRunner sqlRunner) {
        this.sqlRunner = sqlRunner;
    }

    public void insert(Funcionario f) {
        String sql = "INSERT INTO backend_db.funcionario " +
                "(nome, cargo, cpf, rg, data_nascimento, email, telefone, salario, beneficios, formacao, cursos, " +
                "data_contratacao, tipo_contrato, endereco, cidade, estado, cep) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        sqlRunner.executeUpdate(
                sql,
                f.getNome(),
                f.getCargo(),
                f.getCpf(),
                f.getRg(),
                f.getDataNascimento() != null ? f.getDataNascimento().toString() : null,
                f.getEmail(),
                f.getTelefone(),
                f.getSalario(),
                f.getBeneficios(),
                f.getFormacao(),
                f.getCursos(),
                f.getDataContratacao() != null ? f.getDataContratacao().toString() : null,
                f.getTipoContrato(),
                f.getEndereco(),
                f.getCidade(),
                f.getEstado(),
                f.getCep()
        );
    }
}
