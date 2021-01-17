package br.com.springprocesso.pucsigo.controller;

import br.com.springprocesso.pucsigo.controller.dto.TipoProcessoRq;
import br.com.springprocesso.pucsigo.controller.dto.TipoProcessoRs;
import br.com.springprocesso.pucsigo.model.TipoProcesso;
import br.com.springprocesso.pucsigo.repository.TipoProcessoCustomRepository;
import br.com.springprocesso.pucsigo.repository.TipoProcessoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tipo_processo")
public class TipoProcessoController {

    private final TipoProcessoRepository tipoprocessoRepository;
    private final TipoProcessoCustomRepository tipoprocessoCustomRepository;

    public TipoProcessoController(TipoProcessoRepository tipoprocessoRepository, TipoProcessoCustomRepository tipoprocessoCustomRepository) {
        this.tipoprocessoRepository = tipoprocessoRepository;
        this.tipoprocessoCustomRepository = tipoprocessoCustomRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<TipoProcessoRs> findAll() {
        var tipoprocessos = tipoprocessoRepository.findAll();
        return tipoprocessos
                .stream()
                .map(TipoProcessoRs::converter)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public TipoProcessoRs findById(@PathVariable("id") Long id) {
        var tipoprocesso = tipoprocessoRepository.getOne(id);
        return TipoProcessoRs.converter(tipoprocesso);
    }

    @CrossOrigin
    @PostMapping("/")
    public void saveTipoProcesso(@RequestBody TipoProcessoRq tipoprocesso) {
        var n = new TipoProcesso(tipoprocesso.getNome(),tipoprocesso.getDataCriacao(),tipoprocesso.getDataAlteracao(),tipoprocesso.getIndativo());
        tipoprocessoRepository.save(n);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody TipoProcessoRq tipoprocesso) throws Exception {
        var p = tipoprocessoRepository.findById(id);

        if (p.isPresent()) {
            var tipoprocessoSave = p.get();
            tipoprocessoSave.setNome(tipoprocesso.getNome());    
            tipoprocessoSave.setDataCriacao(tipoprocesso.getDataCriacao());
            tipoprocessoSave.setDataAlteracao(tipoprocesso.getDataAlteracao());
            tipoprocessoSave.setIndativo(tipoprocesso.getIndativo());
            tipoprocessoRepository.save(tipoprocessoSave);
        } else {
            throw new Exception("Tipo de Processo Não encontrado");
        }
    }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id ) throws Exception {
        var p = tipoprocessoRepository.findById(id);
        if (p.isPresent()) {
            tipoprocessoRepository.deleteById(id);        
        } else {
            throw new Exception("Tipo de Processo Não encontrado");
        }
    }

}
