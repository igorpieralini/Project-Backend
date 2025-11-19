package com.pieralini.backend.dto;

import com.pieralini.backend.models.Usuario;

public class LoginResponse {
    public Long id;
    public String email;

    public LoginResponse(Usuario u) {
        this.id = u.getId();
        this.email = u.getEmail();
    }
}
