package com.project.store.entity;

import java.util.Collection;
import java.util.List;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuarios")

public class Usuario  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String login;
	@Column
	private String password;
	@Column
	private String role;
	
	
	public Long getId() {
		return id;
	}


	public Usuario() {
		
	}


	




	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}



	