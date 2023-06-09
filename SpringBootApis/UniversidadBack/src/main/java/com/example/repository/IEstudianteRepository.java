package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
