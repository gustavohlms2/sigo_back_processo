package br.com.springprocesso.pucsigo.repository;

import br.com.springprocesso.pucsigo.model.Operador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorRepository extends JpaRepository<Operador, Long> {
    Operador findById(long id); 
}


