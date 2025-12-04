package com.pieralini.backend.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cargo;

    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    private String email;
    private String telefone;

    private BigDecimal salario;
    private BigDecimal beneficios;
    private String formacao;

    @Lob
    private String cursos;

    private LocalDate dataContratacao;
    private LocalDate dataDemissao;
    private String tipoContrato;

    private String endereco;
    private String cidade;
    private String estado;
    private String cep;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public BigDecimal getBeneficios() {
        return beneficios;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getCursos() {
        return cursos;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setBeneficios(BigDecimal beneficios) {
        this.beneficios = beneficios;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}