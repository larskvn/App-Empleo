/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.SolicitudesEntity;
import com.empleos.Repository.SolicitudesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SolicitudesServiceImpl implements SolicitudesService{
    
    @Autowired
    private SolicitudesRepository solicitudesRepository;

    @Override
    public List<SolicitudesEntity> listarTodasLasSolicitudes() {
        return solicitudesRepository.findAll();
    }

    @Override
    public SolicitudesEntity add(SolicitudesEntity solicitudesEntity) {
        return solicitudesRepository.save(solicitudesEntity);
    }
    
}
