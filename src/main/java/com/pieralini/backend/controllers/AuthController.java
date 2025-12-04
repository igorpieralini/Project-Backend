package com.pieralini.backend.controllers;

import com.pieralini.backend.models.Usuario;
import com.pieralini.backend.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        Optional<Usuario> user = usuarioRepository.findByEmailAndSenha(
                loginRequest.getEmail(),
                loginRequest.getSenha()
        );

        return user.orElse(null);
    }
}
