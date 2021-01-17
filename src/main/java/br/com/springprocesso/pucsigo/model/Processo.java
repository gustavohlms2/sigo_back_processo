package br.com.springprocesso.pucsigo.model;

import javax.persistence.*;

@Entity
@Table(name = "processo")
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="idoperador")
    private Long idoperador;

    @Column(name="idtipo_processo")
    private Long idtipo_processo;

    @Column(name="prioridade")
    private Long prioridade;

    @Column(name="status")
    private Boolean status;

    @Column(name="data_criacao")
    private String data_criacao;

    @Column(name="data_alteracao")
    private String data_alteracao;

    @Column(name="indativo")
    private Boolean indativo;

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
