/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.empleos.Service;


import com.empleos.Entity.UsuariosEntity;
import java.util.List;



public interface UsuarioService {
    
    
    public List<UsuariosEntity> listarTodasLosUsuarios();
    
    public UsuariosEntity add(UsuariosEntity usuariosEntity);  
    
}
