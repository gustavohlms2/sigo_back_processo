package br.com.springprocesso.pucsigo.controller;

import br.com.springprocesso.pucsigo.controller.dto.ProcessoRq;
import br.com.springprocesso.pucsigo.controller.dto.ProcessoRs;
import br.com.springprocesso.pucsigo.model.Processo;
import br.com.springprocesso.pucsigo.repository.ProcessoCustomRepository;
import br.com.springprocesso.pucsigo.repository.ProcessoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/processo")
public class ProcessoController {

    private final ProcessoRepository processoRepository;
    private final ProcessoCustomRepository processoCustomRepository;

    public ProcessoController(ProcessoRepository processoRepository, ProcessoCustomRepository processoCustomRepository) {
        this.processoRepository = processoRepository;
        this.processoCustomRepository = processoCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<ProcessoRs> findAll() {
        var processos = processoRepository.findAll();
        return processos
                .stream()
                .map(ProcessoRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ProcessoRs findById(@PathVariable("id") Long id) {
        var processo = processoRepository.getOne(id);
        return ProcessoRs.converter(processo);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveProcesso(@RequestBody ProcessoRq processo) {
        var n = new Processo();
        n.setNome(processo.getNome());
        n.setDescricao(processo.getDescricao());
        n.setIdoperador(processo.getIdoperador());
        n.setIdtipoprocesso(processo.getIdtipoprocesso());
        n.setPrioridade(processo.getPrioridade());
        n.setStatus(processo.getStatus());
        n.setDataCriacao(processo.getDataCriacao());
        n.setDataAlteracao(processo.getDataAlteracao());
        n.setIndativo(processo.getIndativo());  
        processoRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody ProcessoRq processo) throws Exception {
        var p = processoRepository.findById(id);

        if (p.isPresent()) {
            var processoSave = p.get();
            processoSave.setNome(processo.getNome());
            processoSave.setDescricao(processo.getDescricao());
            processoSave.setIdoperador(processo.getIdoperador());
            processoSave.setIdtipoprocesso(processo.getIdtipoprocesso());
            processoSave.setPrioridade(processo.getPrioridade());
            processoSave.setStatus(processo.getStatus());
            processoSave.setDataCriacao(processo.getDataCriacao());
            processoSave.setDataAlteracao(processo.getDataAlteracao());
            processoSave.setIndativo(processo.getIndativo());            
            processoRepository.save(processoSave);
        } else {
            throw new Exception("Processo Não encontrado");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = processoRepository.findById(id);
        if (p.isPresent()) {
            processoRepository.deleteById(id);        
        } else {
            throw new Exception("Processo Não encontrado");
        }
    }

}
