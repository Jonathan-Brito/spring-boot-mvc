package com.jonathan.brito.spring.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.jonathan.brito.spring.boot.domain.Departamento;
import com.jonathan.brito.spring.boot.service.DepartamentoService;


@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {
	
	@Autowired
	private DepartamentoService service;

	@Override
	public Departamento convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}

