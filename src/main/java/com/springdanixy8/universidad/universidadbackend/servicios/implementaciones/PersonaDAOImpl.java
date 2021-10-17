package com.springdanixy8.universidad.universidadbackend.servicios.implementaciones;

import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Persona;
import com.springdanixy8.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springdanixy8.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class PersonaDAOImpl extends GenericDAOImpl<Persona, PersonaRepository> implements PersonaDAO {


    public PersonaDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorNombreyApellido(String nombre, String apellido) {
        return repository.buscarPorNombreyApellido(nombre, apellido);
    }

    @Override
    @Transactional
    public Optional<Persona> buscarPorDni(String dni) {
        return repository.buscarPorDni(dni);
    }

    @Override
    @Transactional
    public Iterable<Persona> buscarPersonaporApellido(String apellido) {
        return repository.buscarPersonaporApellido(apellido);
    }
}
