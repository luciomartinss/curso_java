package com.example.cadastropessoas.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.cadastropessoas.model.entities.Pessoa;

public interface PessoasRepository extends PagingAndSortingRepository<Pessoa, Integer>{

	public Iterable<Pessoa> findByNomeContainingIgnoreCase(String parteNome); 
	
	public Iterable<Pessoa> findBySexoContainingIgnoreCase(String sexo); 
	
}
