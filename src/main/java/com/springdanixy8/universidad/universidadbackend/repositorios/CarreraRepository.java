package com.springdanixy8.universidad.universidadbackend.repositorios;

import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

}
