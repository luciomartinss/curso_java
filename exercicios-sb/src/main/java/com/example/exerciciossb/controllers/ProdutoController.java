package com.example.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.entities.Produto;
import com.example.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtosRepository;
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam Double preco, @RequestParam Double desconto) {
		Produto produto = new Produto(nome, preco, desconto);
		produto.precoFinal(preco, desconto);
		produtosRepository.save(produto);
		return produto;
	}
}
