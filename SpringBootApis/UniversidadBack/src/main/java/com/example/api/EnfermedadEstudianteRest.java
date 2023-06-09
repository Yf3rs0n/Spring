package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.EnfermedadEstudiante;
import com.example.service.IEnfermedadEstudianteService;

@RestController
@RequestMapping("/api/enfermedad-estudiante")
public class EnfermedadEstudianteRest {

	@Autowired
	private IEnfermedadEstudianteService service;

	@GetMapping("")
	public List<EnfermedadEstudiante> listarTodos() {
		return service.listarTodos();
	}

	@PostMapping("")
	public void registrar(@RequestBody EnfermedadEstudiante enfermedadEstudiante) {
		service.registrar(enfermedadEstudiante);
	}

	@GetMapping("/listarPorIdEstudiante/{idEstudiante}")
	public List<EnfermedadEstudiante> listarPorIdEstudiante(@PathVariable int idEstudiante) {
		return service.listarPorIdEstudiante(idEstudiante);
	}

}
