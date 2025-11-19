package com.pieralini.backend.services;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository repo;

    public List<Funcionario> listar() {
        return repo.findAll();
    }

    public Funcionario salvar(Funcionario f) {
        return repo.save(f);
    }

    public Funcionario buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }

    public Funcionario atualizar(Long id, Funcionario f) {
        Funcionario existente = buscar(id);

        existente.setNome(f.getNome());
        existente.setCargo(f.getCargo());
        existente.setEmail(f.getEmail());

        return repo.save(existente);
    }

    public void excluir(Long id) {
        repo.deleteById(id);
    }
}
