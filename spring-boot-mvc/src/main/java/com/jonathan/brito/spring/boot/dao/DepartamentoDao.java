package com.jonathan.brito.spring.boot.dao;

import java.util.List;

import com.jonathan.brito.spring.boot.domain.Departamento;

public interface DepartamentoDao {
	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long Id);
	
	List<Departamento> findAll();

}
