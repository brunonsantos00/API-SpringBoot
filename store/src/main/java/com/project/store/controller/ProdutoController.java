package com.project.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.store.dto.ProdutoDTO;
import com.project.store.service.ProdutoService;



@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "http://localhost:3000")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	

	
	@PostMapping("/add")
	public ResponseEntity<ProdutoDTO> add(@RequestBody ProdutoDTO produto){
		return ResponseEntity.ok(produtoService.saveProduto(produto));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<ProdutoDTO>>getAllProdutos(){
		return ResponseEntity.ok(produtoService.getAllProdutos());
	}
	
	@PutMapping("/put")
	public ResponseEntity<ProdutoDTO> alterar(@RequestBody ProdutoDTO produto){
		return ResponseEntity.ok(produtoService.saveProduto(produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduto(@PathVariable Long id){
		produtoService.deleteProduto(id);
		return ResponseEntity.ok("Produto Deletado com sucesso");
	}
}
