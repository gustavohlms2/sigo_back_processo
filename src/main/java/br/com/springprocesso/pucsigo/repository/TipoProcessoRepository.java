package br.com.springprocesso.pucsigo.repository;

import br.com.springprocesso.pucsigo.model.TipoProcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProcessoRepository extends JpaRepository<TipoProcesso, Long> {
    public TipoProcesso findByNome(String name);
}


