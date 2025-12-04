package com.pieralini.backend.queries;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.utils.SqlRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class FuncionariosConsult {

    private final SqlRunner sqlRunner;

    private FuncionariosConsult(SqlRunner sqlRunner) {
        this.sqlRunner = sqlRunner;
    }

    public List<Funcionario> ListAll() {

        String sql = "SELECT * FROM backend_db.funcionario";

        List<Map<String, Object>> result = sqlRunner.ReturnSqlFromQuery(sql);

        List<Funcionario> funcionarios = new ArrayList<>();

        for (Map<String, Object> row : result) {
            Funcionario f = new Funcionario();

            f.setId(((Number) row.get("id")).longValue());
            f.setNome((String) row.get("nome"));
            f.setCargo((String) row.get("cargo"));

            f.setCpf((String) row.get("cpf"));
            f.setRg((String) row.get("rg"));
            f.setDataNascimento(row.get("data_nascimento") != null ?
                    LocalDate.parse(row.get("data_nascimento").toString()) : null);

            f.setEmail((String) row.get("email"));
            f.setTelefone((String) row.get("telefone"));

            f.setSalario(BigDecimal.valueOf(row.get("salario") != null ? ((Number) row.get("salario")).doubleValue() : null));
            f.setBeneficios(BigDecimal.valueOf(row.get("beneficios") != null ? ((Number) row.get("beneficios")).doubleValue() : null));

            f.setFormacao((String) row.get("formacao"));
            f.setCursos((String) row.get("cursos"));

            f.setDataContratacao(row.get("data_contratacao") != null ?
                    LocalDate.parse(row.get("data_contratacao").toString()) : null);

            f.setDataDemissao(row.get("data_demissao") != null ?
                    LocalDate.parse(row.get("data_demissao").toString()) : null);

            f.setTipoContrato((String) row.get("tipo_contrato"));

            f.setEndereco((String) row.get("endereco"));
            f.setCidade((String) row.get("cidade"));
            f.setEstado((String) row.get("estado"));
            f.setCep((String) row.get("cep"));

            funcionarios.add(f);
        }

        return funcionarios;
    }
}
