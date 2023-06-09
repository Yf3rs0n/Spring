package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.EnfermedadEstudiante;
import com.example.repository.IEnfermedadEstudianteRepository;
import com.example.service.IEnfermedadEstudianteService;

@Service
public class EnfermedadEstudianteServiceImpl implements IEnfermedadEstudianteService {

	@Autowired
	private IEnfermedadEstudianteRepository repo;

	@Override
	public List<EnfermedadEstudiante> listarTodos() {
		return repo.findAll();
	}

	@Override
	public EnfermedadEstudiante listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(EnfermedadEstudiante entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(EnfermedadEstudiante entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<EnfermedadEstudiante> listarPorIdEstudiante(int idEstudiante) {
		return repo.listarPorIdEstudiante(idEstudiante);
	}

}
