package com.pieralini.backend.controllers;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin(origins = "*")
public class FuncionarioController {

    @Autowired
    FuncionarioService service;

    @GetMapping
    public List<Funcionario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Funcionario buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario f) {
        return service.salvar(f);
    }

    @PutMapping("/{id}")
    public Funcionario atualizar(@PathVariable Long id, @RequestBody Funcionario f) {
        return service.atualizar(id, f);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
