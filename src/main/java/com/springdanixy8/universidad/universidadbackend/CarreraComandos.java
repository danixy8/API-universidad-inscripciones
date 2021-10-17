package com.springdanixy8.universidad.universidadbackend;

import com.springdanixy8.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springdanixy8.universidad.universidadbackend.servicios.contratos.CarrerasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarrerasDAO servicio;

    @Override
    public void run(String... args) throws Exception {
/*        Carrera ingSistemas = new Carrera(null, "Ingenieria de sistemas", 50, 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());*/

        Carrera carrera = null;
        Optional<Carrera> oCarrera = servicio.findById(1);
        if(oCarrera.isPresent()){
            carrera = oCarrera.get();
            System.out.println(carrera.toString());
        }else{
            System.out.println("carrera no encontrada");
        }

        carrera.setCantidaMaterias(65);
        carrera.setCantidadAnios(6);

        servicio.save(carrera);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

        servicio.deleteById(1);
        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

    }
}
