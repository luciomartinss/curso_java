package com.example.cadastropessoas.cotrollers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cadastropessoas.model.entities.Pessoa;
import com.example.cadastropessoas.model.repositories.PessoasRepository;

@RestController
@RequestMapping(path = "/api/pessoas")
public class PessoaController {

	@Autowired
	private PessoasRepository pessoasRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Pessoa salvarPessoas(@Valid Pessoa pessoa) {
		pessoasRepository.save(pessoa);
		return pessoa;
	}
	
	@GetMapping(path = "/{id}") 
	public Optional<Pessoa> obterPessoaPorId(@PathVariable int id) {
		return pessoasRepository.findById(id);
	}
	
	@GetMapping(path = "/sexo/{sexo}") 
	public Iterable<Pessoa> obterPessoaPorSexo(@PathVariable String sexo) {
		return pessoasRepository.findBySexoContainingIgnoreCase(sexo);
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Pessoa> obterPessoaPorNome(@PathVariable String parteNome) {
		return pessoasRepository.findByNomeContainingIgnoreCase(parteNome);
		
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdeItens}")
	public Iterable<Pessoa> obterPessoasPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdeItens){
		if(qtdeItens >= 5) qtdeItens = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdeItens);
		return pessoasRepository.findAll(page);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirPessoa(@PathVariable int id) {
		pessoasRepository.deleteById(id);
	}
}
