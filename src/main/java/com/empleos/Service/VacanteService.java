/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.empleos.Service;

import com.empleos.Entity.VacanteEntity;
import java.util.List;
import java.util.Optional;
import org.yaml.snakeyaml.events.Event;




public interface VacanteService {
    
    public List<VacanteEntity> listarTodasLasVacantes();
    
    public Optional<VacanteEntity> findById(Long id);
    
    public VacanteEntity add(VacanteEntity vacanteEntity);   
    
    public VacanteEntity update(VacanteEntity vacanteEntity);
    
    public VacanteEntity delete(Long id);
}
