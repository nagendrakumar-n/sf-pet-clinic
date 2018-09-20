package com.vivek.spring5.services;

import org.springframework.stereotype.Service;

import com.vivek.spring5.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
