package br.com.springprocesso.pucsigo.controller.dto;

import br.com.springprocesso.pucsigo.model.Operador;

public class OperadorRs {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cargo;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static OperadorRs converter(Operador p) {
        var operador = new OperadorRs();
        operador.setId(p.getId());
        operador.setNome(p.getNome());
        operador.setEmail(p.getEmail());
        operador.setTelefone(p.getTelefone());
        operador.setCargo(p.getCargo());
        operador.setDataCriacao(p.getDataCriacao());
        operador.setDataAlteracao(p.getDataAlteracao());
        operador.setIndativo(p.getIndativo());
        return operador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataCriacao() {
        return data_criacao;
    }

    public void setDataCriacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getDataAlteracao() {
        return data_alteracao;
    }

    public void setDataAlteracao(String data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public Boolean getIndativo() {
        return indativo;
    }

    public void setIndativo(Boolean indativo) {
        this.indativo = indativo;
    }

}
