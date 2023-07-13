/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.VacanteEntity;
import com.empleos.Repository.VacanteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacanteServiceImpl implements VacanteService {

    @Autowired
    private VacanteRepository vacanteRepositorio;

    @Override
    public List<VacanteEntity> listarTodasLasVacantes() {
        return vacanteRepositorio.findAll();
    }
    
    @Override
    public Optional<VacanteEntity> findById(Long id) {
        return vacanteRepositorio.findById(id);
    }

    @Override
    public VacanteEntity add(VacanteEntity vacanteEntity) {
        return vacanteRepositorio.save(vacanteEntity);
    }

    @Override
    public VacanteEntity update(VacanteEntity vacanteEntity) {
        return vacanteRepositorio.save(vacanteEntity);
    }

    @Override
    public VacanteEntity delete(Long id) {
        VacanteEntity vacante = vacanteRepositorio.findById(id).orElse(null);
        if (vacante != null) {
            vacanteRepositorio.deleteById(id);
        }
        return vacante;
    }
}
