package com.project.store.dto;

import com.project.store.entity.Produto;

public class ProdutoDTO {
	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.name = produto.getName();
		this.price = produto.getPrice();
	}
	
	private Long id;
	private String name;
	private Double price;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
