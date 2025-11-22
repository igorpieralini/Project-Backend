package com.pieralini.backend.controllers;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.queries.FuncionariosConsult;
import com.pieralini.backend.queries.InsertFuncionarioQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "[http://localhost:4200](http://localhost:4200)")
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionariosConsult funcionariosConsult;

    @Autowired
    private InsertFuncionarioQuery insertFuncionarioQuery;

    @GetMapping
    public List<Funcionario> listar() {
        return funcionariosConsult.ListAll();
    }

    @PostMapping
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        insertFuncionarioQuery.insert(funcionario);
        return funcionario;
    }

}
