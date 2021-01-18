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

import br.com.springprocesso.pucsigo.model.Operador;
import br.com.springprocesso.pucsigo.repository.OperadorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Operador")
public class OperadorController {
	
	@Autowired
	OperadorRepository operadorRepository;
	
	@ApiOperation(value="Retorna uma lista de Operadores")
	@GetMapping("/operador")
	public List<Operador> listaProdutos(){
		return operadorRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um operador unico")
	@GetMapping("/operador/{id}")
	public Operador listaProdutoUnico(@PathVariable(value="id") long id){
		return operadorRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um operador")
	@PostMapping("/operador")
	public Operador salvaProduto(@RequestBody @Valid Operador operador) {
		return operadorRepository.save(operador);
	}
	
	@ApiOperation(value="Deleta um operador")
	@DeleteMapping("/operador")
	public void deletaProduto(@RequestBody @Valid Operador operador) {
		operadorRepository.delete(operador);
	}
	
	@ApiOperation(value="Atualiza um operador")
	@PutMapping("/operador")
	public Operador atualizaProduto(@RequestBody @Valid Operador operador) {
		return operadorRepository.save(operador);
	}
	 

}
