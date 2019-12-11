package com.itsector.exercicio.backoffice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.itsector.exercicio.backoffice.model.Contato;
import com.itsector.exercicio.backoffice.repository.ContatoRepository;

@Service
public class ContatoServiceImpl implements ContatoService {
	
	private ContatoRepository repository;
	
	ContatoServiceImpl(ContatoRepository contatoRepository) {
		this.repository = contatoRepository;
	}
	
	public List findAll(){
		return repository.findAll();
	}

	@Override
	public Contato create(Contato contato) {
		return repository.save(contato);
	}

	@Override
	public ResponseEntity update(long id, Contato contato) {
		return repository.findById(id).map(record -> {
            record.setNome	 	(contato.getNome());
            record.setPassword	(contato.getPassword());
            
            Contato updated = repository.save(record);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
	}

	@Override
	public ResponseEntity<?> delete(long id) {
		return repository.findById(id).map(record -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
	}
}
