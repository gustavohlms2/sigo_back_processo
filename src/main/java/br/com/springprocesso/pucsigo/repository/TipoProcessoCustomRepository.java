package br.com.springprocesso.pucsigo.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class TipoProcessoCustomRepository {

    private final EntityManager em;

    public TipoProcessoCustomRepository(EntityManager em) {
        this.em = em;
    }

}
