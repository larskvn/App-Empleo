/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Controller;

import com.empleos.Entity.SolicitudesEntity;
import com.empleos.Service.SolicitudesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SolicitudController {

    @Autowired
    private SolicitudesService solicitudesService;

    @GetMapping("/postular")
    public String mostrarFormularioRegistro(Model model) {
        SolicitudesEntity solicitud = new SolicitudesEntity();
        model.addAttribute("solicitud", solicitud);
        return "solicitud";
    }

    @PostMapping("/enviosolicitud")
    public String registrarUsuario(SolicitudesEntity solicitudesEntity) {
        solicitudesService.add(solicitudesEntity);
        return "redirect:/";
    }

}
