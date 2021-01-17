package br.com.springprocesso.pucsigo.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OperadorCustomRepository {

    private final EntityManager em;

    public OperadorCustomRepository(EntityManager em) {
        this.em = em;
    }

   
}
