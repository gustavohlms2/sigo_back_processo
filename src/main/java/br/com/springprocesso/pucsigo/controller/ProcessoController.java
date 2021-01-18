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

import br.com.springprocesso.pucsigo.model.Processo;
import br.com.springprocesso.pucsigo.repository.ProcessoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Processo")
public class ProcessoController {
	
	@Autowired
	ProcessoRepository processoRepository;
	
	@ApiOperation(value="Retorna uma lista de Processos")
	@GetMapping("/processo")
	public List<Processo> listaProdutos(){
		return processoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um processo unico")
	@GetMapping("/processo/{id}")
	public Processo listaProdutoUnico(@PathVariable(value="id") long id){
		return processoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um processo")
	@PostMapping("/processo")
	public Processo salvaProduto(@RequestBody @Valid Processo processo) {
		return processoRepository.save(processo);
	}
	
	@ApiOperation(value="Deleta um processo")
	@DeleteMapping("/processo")
	public void deletaProduto(@RequestBody @Valid Processo processo) {
		processoRepository.delete(processo);
	}
	
	@ApiOperation(value="Atualiza um processo")
	@PutMapping("/processo")
	public Processo atualizaProduto(@RequestBody @Valid Processo processo) {
		return processoRepository.save(processo);
	}
	 

}
