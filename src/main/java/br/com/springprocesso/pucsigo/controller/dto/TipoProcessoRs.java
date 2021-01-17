package br.com.springprocesso.pucsigo.controller.dto;

import br.com.springprocesso.pucsigo.model.TipoProcesso;

public class TipoProcessoRs {

    private Long id;
    private String nome;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static TipoProcessoRs converter(TipoProcesso p) {
        var tipoprocesso = new TipoProcessoRs();
        tipoprocesso.setId(p.getId());
        tipoprocesso.setNome(p.getNome());
        tipoprocesso.setDataCriacao(p.getDataCriacao());
        tipoprocesso.setDataAlteracao(p.getDataAlteracao());
        tipoprocesso.setIndativo(p.getIndativo());
        return tipoprocesso;
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
