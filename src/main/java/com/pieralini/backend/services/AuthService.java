package com.pieralini.backend.services;

import com.pieralini.backend.models.Usuario;
import com.pieralini.backend.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UsuarioRepository repo;

    public Usuario login(String email, String senha){
        return repo.findByEmailAndSenha(email, senha)
                .orElseThrow(() -> new RuntimeException("Credenciais inválidas"));
    }
}
