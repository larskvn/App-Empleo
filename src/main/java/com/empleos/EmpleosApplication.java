package com.empleos;

import com.empleos.Entity.VacanteEntity;
import com.empleos.Repository.VacanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpleosApplication /*implements CommandLineRunner */{

   /* @Autowired
    private VacanteRepository vacanteRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(EmpleosApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        VacanteEntity vacante1 = new VacanteEntity("Diseñador", "Se requiere diseñador grafico", null, null, null, null);
        vacanteRepository.save(vacante1);

       /*VacanteEntity vacante2 = new  VacanteEntity("Ing Sistemas", "se requiere ing con experiencia", 15.2, 1, "null", "urgente");
       vacanteRepository.save(vacante2);
    }*/

}
