package com.itsector.exercicio.backoffice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsector.exercicio.backoffice.model.Contato;
import com.itsector.exercicio.backoffice.service.ContatoService;

@RestController
@RequestMapping({"/contatos"})
public class ContatoController {
	
	// == fields ==
	private ContatoService contatoService;
	
	
	// == Construtores ==
	ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	@GetMapping
	public List findAll(){
		return contatoService.findAll();
	}

	@PostMapping
	public Contato create(@RequestBody Contato contato){
		return contatoService.create(contato);
	}
	
	// @GetMapping(path ={"/delete/{id}"})
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		return contatoService.delete(id);
	}

	// @GetMapping(path ={"/update/{id}"})
	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody Contato contato) {
		return contatoService.update(id, contato);
	}
}
