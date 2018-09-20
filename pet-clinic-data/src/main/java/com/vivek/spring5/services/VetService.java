package com.vivek.spring5.services;

import java.util.Set;

import com.vivek.spring5.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
