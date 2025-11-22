package com.pieralini.backend.queries;

import com.pieralini.backend.models.Usuario;
import com.pieralini.backend.utils.SqlRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class AuthQuery {

    private final SqlRunner sqlRunner;

    private AuthQuery(SqlRunner sqlRunner) {
        this.sqlRunner = sqlRunner;
    }

    public Optional<Usuario> login(String email, String senha) {
        String sql = "SELECT * FROM backend_db.usuario WHERE email = ? AND senha = ?";

        List<Map<String, Object>> result = sqlRunner.ReturnSqlFromQuery(sql, email, senha);

        if (!result.isEmpty()) {
            Map<String, Object> row = result.get(0);
            Usuario usuario = new Usuario();
            usuario.setId(((Number) row.get("id")).longValue());
            usuario.setEmail((String) row.get("email"));
            usuario.setSenha((String) row.get("senha"));
            return Optional.of(usuario);
        }

        return Optional.empty();
    }
}
