package br.com.springprocesso.pucsigo.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_processo")
public class TipoProcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome", unique = true, nullable = false)
    private String nome;

    @Column(name="data_criacao")
    private String data_criacao;

    @Column(name="data_alteracao")
    private String data_alteracao;

    @Column(name="indativo")
    private Boolean indativo;

    public TipoProcesso(String nome, String data_criacao, String data_alteracao, Boolean indativo) {
		this.nome = nome;
        this.data_criacao = data_criacao;
        this.data_alteracao = data_alteracao;
		this.indativo = indativo;
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
