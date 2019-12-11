package com.itsector.exercicio.backoffice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.itsector.exercicio.backoffice.repository.ContatoRepository;
import com.itsector.exercicio.backoffice.service.ContatoService;

@RestController
@RequestMapping({"/contatos"})
public class ContatoController {
	
	// == fields ==
	// private ContatoRepository repository;
	private ContatoService contatoService;
	

	// == Construtores ==
	/*ContatoController(ContatoRepository contatoRepository) {
		this.repository = contatoRepository;
	}*/
	@Autowired
	ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}

	
	@GetMapping
	public List findAll(){
		return contatoService.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity findById(@PathVariable long id){
		return contatoService.findById(id);
	}
	
	@PostMapping
	public Contato create(@RequestBody Contato contato){
		return contatoService.create(contato);
	}

	// @GetMapping(path ={"/update/{id}"})
	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody Contato contato) {
	   
		/*Optional<Contato> contatoBase = repository.findById(id);
		ResponseEntity resultado;
		
		contatoBase.map(record -> {
            record.setNome	 (contato.getNome());
            record.setEmail	 (contato.getEmail());
            record.setTelefone(contato.getTelefone());
            
            Contato updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
		});*/
		
		
		return contatoService.update(id, contato);
	}
	
	// @GetMapping(path ={"/delete/{id}"})
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		return contatoService.delete(id);
	}
}
