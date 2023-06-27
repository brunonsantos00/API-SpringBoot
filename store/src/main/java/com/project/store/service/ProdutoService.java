package com.project.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.store.conveter.ProdutoDTOToEntityConverter;
import com.project.store.conveter.ProdutoEntityToDTOConverter;
import com.project.store.dto.ProdutoDTO;
import com.project.store.repository.ProdutoRepository;



@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private ProdutoEntityToDTOConverter produtoEntityToDTOConverter;
	@Autowired
	private ProdutoDTOToEntityConverter produtoDTOToEntityConverter;
	
	public ProdutoDTO saveProduto(ProdutoDTO produto) {
		return produtoEntityToDTOConverter.convert(produtoRepository.save(produtoDTOToEntityConverter.convert(produto)));
	}
	
	public List<ProdutoDTO> getAllProdutos(){
		return produtoRepository.findAll().stream().map(a-> produtoEntityToDTOConverter.convert(a)).collect(Collectors.toList());
	}
	
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
