package com.vivek.spring5.services.map;

import java.util.Set;

import com.vivek.spring5.model.Owner;
import com.vivek.spring5.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner FindById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.Save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
}
