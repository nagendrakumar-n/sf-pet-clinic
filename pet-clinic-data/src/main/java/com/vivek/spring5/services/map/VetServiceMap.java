package com.vivek.spring5.services.map;

import java.util.Set;

import com.vivek.spring5.model.Vet;
import com.vivek.spring5.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet FindById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.Save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
}
