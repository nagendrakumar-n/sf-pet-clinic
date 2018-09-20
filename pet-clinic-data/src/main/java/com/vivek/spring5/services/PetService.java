package com.vivek.spring5.services;

import java.util.Set;

import com.vivek.spring5.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
