package com.pieralini.backend.controllers;

import com.pieralini.backend.models.Usuario;
import com.pieralini.backend.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    AuthService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario user) {
        Usuario u = service.login(user.getEmail(), user.getSenha());
        return ResponseEntity.ok(u);
    }
}
