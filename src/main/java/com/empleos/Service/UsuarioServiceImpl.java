/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.UsuariosEntity;
import com.empleos.Repository.UsuariosRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<UsuariosEntity> listarTodasLosUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public UsuariosEntity add(UsuariosEntity usuariosEntity) {
        usuariosEntity.setFechaRegistro(LocalDate.now());
        return usuariosRepository.save(usuariosEntity);
    }

}
