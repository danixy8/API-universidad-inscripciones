package com.springdanixy8.universidad.universidadbackend.servicios.contratos;

import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Persona;

import java.util.Optional;

public interface PersonaDAO extends GenericDAO<Persona>{

    Optional<Persona> buscarPorNombreyApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonaporApellido(String apellido);

}
