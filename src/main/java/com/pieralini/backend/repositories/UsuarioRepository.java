package com.pieralini.backend.repositories;

import com.pieralini.backend.models.Usuario;
import com.pieralini.backend.queries.AuthQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioRepository {

    private final AuthQuery authQuery;

    public UsuarioRepository(AuthQuery authQuery) {
        this.authQuery = authQuery;
    }

    public Optional<Usuario> findByEmailAndSenha(String email, String senha) {
        return authQuery.login(email, senha);
    }
}
