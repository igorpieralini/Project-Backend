package com.pieralini.backend.controllers;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.queries.FuncionariosConsult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionariosConsult funcionariosConsult;

    @GetMapping
    public List<Funcionario> listar() {
        return funcionariosConsult.ListAll();
    }
}
