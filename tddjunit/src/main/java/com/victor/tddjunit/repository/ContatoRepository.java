package com.victor.tddjunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.tddjunit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
}
