package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EntidadGenerica;

public abstract class ServicioGenerico <E extends EntidadGenerica, R extends JpaRepository<E, Long>> implements IServicioGenerico<E>{
	
	@Autowired
	protected R repository;
	
	//FindAll-----------------------
	
	@Override
	public List<E> findAll(int page, int size) throws Exception {
		
		try {
			Pageable pageable = PageRequest.of(page, size);
			return repository.findAll(pageable).getContent();			

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	//FindById-----------------------
	
	@Override
	public E findById(long id) throws Exception{
		
		try {

			
			Optional<E> varOptional = repository.findById(id);

			E entity = varOptional.get();

			return entity;

		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}
	
	//Save-----------------------
	
	@Override
	public E save(E entityForm) throws Exception {
		try {

			entityForm = repository.save(entityForm);

			return entityForm;

		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}
	
	//Update-----------------------
	
	@Override
	public E update(long id, E entityForm) throws Exception {

		try {
			Optional<E> entityOptional = repository.findById(id);

			E entity = entityOptional.get();

			entity = repository.save(entityForm);

			return entity;
			
		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}

	}
	
	//CountPages-----------------------
	
	@Override
	public int countPages(int size) throws Exception {
		try {
			Pageable pageable = PageRequest.of(0, size);
			return repository.findAll(pageable).getTotalPages();			

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	
	//Delete-----------------------
	
	public boolean delete(long id) throws Exception{
		try {
			if(repository.existsById(id)) {
				repository.deleteById(id);
			}		
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return true;
	}

}
