package br.com.springprocesso.pucsigo.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ProcessoCustomRepository {

    private final EntityManager em;

    public ProcessoCustomRepository(EntityManager em) {
        this.em = em;
    }

   
}
