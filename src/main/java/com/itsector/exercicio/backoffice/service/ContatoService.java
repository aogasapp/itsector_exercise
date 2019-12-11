package com.itsector.exercicio.backoffice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.itsector.exercicio.backoffice.model.Contato;

public interface ContatoService {
	List findAll();
	
	ResponseEntity findById(long id);
	
	Contato create(Contato contato);
	
	ResponseEntity update(long id, Contato contato);
	
	ResponseEntity<?> delete(long id);
}
