package com.example.exerciciossb.controllers;

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

import com.example.exerciciossb.model.entities.Produto;
import com.example.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtosRepository;
	
	//@PostMapping // Create 
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) // Create and Update
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtosRepository.save(produto);
		return produto;
	} 
	
	@GetMapping // Read 
	public Iterable<Produto> obterProdutos() {
		return produtosRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		//return produtosRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtosRepository.searchByNameLike(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdeItens}") // Read by page
	public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdeItens){
		if(qtdeItens >= 5) qtdeItens = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdeItens); // (numero da pag, quantos elementos por page)
		return produtosRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}") // Read
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtosRepository.findById(id);
	}
	
//	@PutMapping // Update
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtosRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtosRepository.deleteById(id);
	}
}
