/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.SolicitudesEntity;
import java.util.List;



public interface SolicitudesService {
    
    
    public List<SolicitudesEntity> listarTodasLasSolicitudes();
    
    public SolicitudesEntity add(SolicitudesEntity solicitudesEntity); 
}
