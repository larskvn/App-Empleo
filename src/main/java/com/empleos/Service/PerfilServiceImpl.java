/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.PerfilEntity;
import com.empleos.Repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerfilServiceImpl  implements PerfilService{
    
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<PerfilEntity> listarTodasLosPerfiles() {
        return perfilRepository.findAll();
    }

    @Override
    public PerfilEntity add(PerfilEntity perfilEntity) {
        return perfilRepository.save(perfilEntity);
    }
    
}
