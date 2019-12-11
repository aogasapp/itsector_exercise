package com.itsector.exercicio.backoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsector.exercicio.backoffice.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
