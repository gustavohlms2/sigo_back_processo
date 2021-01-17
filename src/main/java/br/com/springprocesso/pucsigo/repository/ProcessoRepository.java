package br.com.springprocesso.pucsigo.repository;

import br.com.springprocesso.pucsigo.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

}
