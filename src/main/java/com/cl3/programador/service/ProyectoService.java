package com.cl3.programador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.programador.entity.Proyecto;
import com.cl3.programador.repository.ProyectoRepository;

@Service
public class ProyectoService {

	@Autowired
	private ProyectoRepository proyectoRepository;
	
	public List<Proyecto> listAll(){
		return proyectoRepository.findAll();
	}
}
