package com.project.store.dto;

import com.project.store.entity.Usuario;

public class UsuarioDTO {
	
	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.login = usuario.getUsername();
		this.password = usuario.getPassword();
	}
	
	private Long id;
	private String login;
	private String password;
	private String role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
