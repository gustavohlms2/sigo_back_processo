package br.com.springprocesso.pucsigo.controller;

import br.com.springprocesso.pucsigo.controller.dto.OperadorRq;
import br.com.springprocesso.pucsigo.controller.dto.OperadorRs;
import br.com.springprocesso.pucsigo.model.Operador;
import br.com.springprocesso.pucsigo.repository.OperadorCustomRepository;
import br.com.springprocesso.pucsigo.repository.OperadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/operador")
public class OperadorController {

    private final OperadorRepository operadorRepository;
    private final OperadorCustomRepository operadorCustomRepository;

    public OperadorController(OperadorRepository operadorRepository, OperadorCustomRepository operadorCustomRepository) {
        this.operadorRepository = operadorRepository;
        this.operadorCustomRepository = operadorCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<OperadorRs> findAll() {
        var operadors = operadorRepository.findAll();
        return operadors
                .stream()
                .map(OperadorRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public OperadorRs findById(@PathVariable("id") Long id) {
        var operador = operadorRepository.getOne(id);
        return OperadorRs.converter(operador);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveOperador(@RequestBody OperadorRq operador) {
        var n = new Operador();
        n.setNome(operador.getNome());
        n.setEmail(operador.getEmail());
        n.setTelefone(operador.getTelefone());
        n.setCargo(operador.getCargo());
        n.setDataCriacao(operador.getDataCriacao());
        n.setDataAlteracao(operador.getDataAlteracao());
        n.setIndativo(operador.getIndativo());
        operadorRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody OperadorRq operador) throws Exception {
        var p = operadorRepository.findById(id);

        if (p.isPresent()) {
            var operadorSave = p.get();
            operadorSave.setNome(operador.getNome());
            operadorSave.setEmail(operador.getEmail());
            operadorSave.setTelefone(operador.getTelefone());
            operadorSave.setCargo(operador.getCargo());
            operadorSave.setDataCriacao(operador.getDataCriacao());
            operadorSave.setDataAlteracao(operador.getDataAlteracao());
            operadorSave.setIndativo(operador.getIndativo());
            operadorRepository.save(operadorSave);
        } else {
            throw new Exception("Operador Não encontrado");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = operadorRepository.findById(id);
        if (p.isPresent()) {
            operadorRepository.deleteById(id);        
        } else {
            throw new Exception("Operador Não encontrado");
        }
    }

}
