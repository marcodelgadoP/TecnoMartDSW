package edu.cibertec.tecnomart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.tecnomart.entity.Marca;
import edu.cibertec.tecnomart.repository.MarcaRepository;
import edu.cibertec.tecnomart.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaRepository marcaRepo;
	
	@Override
	public List<Marca> listarMarca() {
		
		return marcaRepo.findAll();
	}

}
