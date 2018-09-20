package com.vivek.spring5.services.map;

import java.util.Set;

import com.vivek.spring5.model.Pet;
import com.vivek.spring5.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet FindById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.Save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
}
