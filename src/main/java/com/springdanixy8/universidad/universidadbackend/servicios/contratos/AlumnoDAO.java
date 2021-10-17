package com.springdanixy8.universidad.universidadbackend.servicios.contratos;


import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO{

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);
}
