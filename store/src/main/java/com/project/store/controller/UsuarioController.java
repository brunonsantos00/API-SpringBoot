package com.project.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.store.entity.Usuario;
import com.project.store.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.saveUsuario(usuario));
	}
	
	public ResponseEntity<Usuario> pegarUsuarioPorId(@PathVariable Long id){
		return ResponseEntity.ok(usuarioService.buscarPorId(id));
	}
	public ResponseEntity<List<Usuario>> pegarTodosUsuarios(){
		return ResponseEntity.ok(usuarioService.listarUsuarios());
				}
	
	public ResponseEntity<String> deletar(@PathVariable Long id){
		return ResponseEntity.ok("Usuario deletado com sucesso");
	}
	}



