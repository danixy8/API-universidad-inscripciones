package com.springdanixy8.universidad.universidadbackend.servicios.implementaciones;

import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springdanixy8.universidad.universidadbackend.repositorios.CarreraRepository;
import com.springdanixy8.universidad.universidadbackend.servicios.contratos.CarrerasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraDAOImpl extends GenericDAOImpl<Carrera, CarreraRepository> implements CarrerasDAO {

    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }
}
