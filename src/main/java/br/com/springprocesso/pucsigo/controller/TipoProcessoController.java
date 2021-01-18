package br.com.springprocesso.pucsigo.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springprocesso.pucsigo.model.TipoProcesso;
import br.com.springprocesso.pucsigo.repository.TipoProcessoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST TipoProcesso")
public class TipoProcessoController {
	
	@Autowired
	TipoProcessoRepository tipo_processoRepository;
	
	@ApiOperation(value="Retorna uma lista de Tipo de Processos")
	@GetMapping("/tipo_processo")
	public List<TipoProcesso> listaProdutos(){
		return tipo_processoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um tipo_processo unico")
	@GetMapping("/tipo_processo/{id}")
	public TipoProcesso listaProdutoUnico(@PathVariable(value="id") long id){
		return tipo_processoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um tipo_processo")
	@PostMapping("/tipo_processo")
	public TipoProcesso salvaProduto(@RequestBody @Valid TipoProcesso tipo_processo) {
		return tipo_processoRepository.save(tipo_processo);
	}
	
	@ApiOperation(value="Deleta um tipo_processo")
	@DeleteMapping("/tipo_processo")
	public void deletaProduto(@RequestBody @Valid TipoProcesso tipo_processo) {
		tipo_processoRepository.delete(tipo_processo);
	}
	
	@ApiOperation(value="Atualiza um tipo_processo")
	@PutMapping("/tipo_processo")
	public TipoProcesso atualizaProduto(@RequestBody @Valid TipoProcesso tipo_processo) {
		return tipo_processoRepository.save(tipo_processo);
	}
	 

}
