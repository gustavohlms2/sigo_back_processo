package br.com.springprocesso.pucsigo.controller.dto;

import br.com.springprocesso.pucsigo.model.Processo;

public class ProcessoRs {

    private Long id;
    private String nome ;
    private String descricao;
    private Long idoperador;
    private Long idtipo_processo;
    private Long prioridade;
    private Boolean status;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static ProcessoRs converter(Processo p) {
        var processo = new ProcessoRs();
        processo.setId(p.getId());
        processo.setNome(p.getNome());
        processo.setDescricao(p.getDescricao());
        processo.setIdoperador(p.getIdoperador());
        processo.setIdtipoprocesso(p.getIdtipoprocesso());
        processo.setPrioridade(p.getPrioridade());
        processo.setStatus(p.getStatus());
        processo.setDataCriacao(p.getDataCriacao());
        processo.setDataAlteracao(p.getDataAlteracao());
        processo.setIndativo(p.getIndativo());
        return processo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdoperador() {
        return idoperador;
    }

    public void setIdoperador(Long idoperador) {
        this.idoperador = idoperador;
    }

    public Long getIdtipoprocesso() {
        return idtipo_processo;
    }

    public void setIdtipoprocesso(Long idtipo_processo) {
        this.idtipo_processo = idtipo_processo;
    }

    public Long getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Long prioridade) {
        this.prioridade = prioridade;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
