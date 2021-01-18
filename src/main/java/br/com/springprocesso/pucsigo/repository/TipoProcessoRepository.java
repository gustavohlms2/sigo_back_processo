package br.com.springprocesso.pucsigo.repository;

import br.com.springprocesso.pucsigo.model.TipoProcesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProcessoRepository extends JpaRepository<TipoProcesso, Long> {
    TipoProcesso findById(long id); 
}


