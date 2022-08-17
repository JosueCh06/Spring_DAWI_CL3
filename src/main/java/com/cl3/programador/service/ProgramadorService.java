package com.cl3.programador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl3.programador.entity.Programador;
import com.cl3.programador.repository.ProgramadorRepository;

@Service
public class ProgramadorService {

	@Autowired
	private ProgramadorRepository programadorRepository;
	
	public void registrar(Programador bean) {
		programadorRepository.save(bean);
	}
	
	public List<Programador> listarAllPorProyecto(int cod){
		return programadorRepository.listarProgramadorPorProyecto(cod);
	}
	
}
