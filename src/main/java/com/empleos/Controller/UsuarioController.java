/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Controller;

import com.empleos.Entity.UsuariosEntity;
import com.empleos.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/form")
    public String mostrarFormularioRegistro(Model model) {
        UsuariosEntity usuarios = new UsuariosEntity();
        model.addAttribute("usuario", usuarios);
        return "formulario";
    }

    @PostMapping("/registro")
    public String registrarUsuario(UsuariosEntity usuario) {
        usuarioService.add(usuario);
        return "redirect:/login?logout";
    }
    
}
