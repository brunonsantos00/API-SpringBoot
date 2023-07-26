package com.project.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido{
	
	@Id
	Long id;
	@Column
	String teste;
	

}