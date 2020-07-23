package com.example.demo.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {

	public Page <Domicilio> findAll(Pageable pageable);
}
