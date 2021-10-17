package com.springdanixy8.universidad.universidadbackend.servicios.contratos;

import java.util.Optional;

public interface GenericDAO<E> {

    Optional<E> findById(Integer id);
    E save(E entidad);
    Iterable<E> findAll();
    void deleteById(Integer id);
}
