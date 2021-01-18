package br.com.springprocesso.pucsigo.repository;

import br.com.springprocesso.pucsigo.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessoRepository extends JpaRepository<Processo, Long> {
    Processo findById(long id); 
}


