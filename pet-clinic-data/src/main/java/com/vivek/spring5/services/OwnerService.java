package com.vivek.spring5.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.vivek.spring5.model.Owner;

@Service
public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
}
