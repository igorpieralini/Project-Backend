package com.pieralini.backend.repositories;

import com.pieralini.backend.models.Funcionario;
import com.pieralini.backend.queries.FuncionariosConsult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FuncionarioRepository {

    private final FuncionariosConsult consult;

    public FuncionarioRepository(FuncionariosConsult consult) {
        this.consult = consult;
    }

    public List<Funcionario> listar() {
        return consult.ListAll();
    }
}
