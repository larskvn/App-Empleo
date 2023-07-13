
package com.empleos.Controller;


import com.empleos.Entity.VacanteEntity;
import com.empleos.Service.CategoriaService;
import com.empleos.Service.VacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class VacanteController  {
    
    @Autowired
    private VacanteService vacanteServicio;
    
    @Autowired
    private  CategoriaService CategoriaService;
    
    @GetMapping("/")
    public String listarVantesYCategorias(Model modelo) {
        modelo.addAttribute("categoria", CategoriaService.listarTodaLasCategorias());
        modelo.addAttribute("vacante", vacanteServicio.listarTodasLasVacantes());
        return "home";
    }
    
  /* @GetMapping("/vacante")
    public String listarVacantes(Model modelo){
        modelo.addAttribute("vacante",vacanteServicio.listarTodasLasVacantes());
        return "home";
    }*/
    @GetMapping("/ver-mas")
    public String verMas() {
        return "redirect/vacanteinfo"; // Nombre de la página a la que quieres redirigir
    }
    
    
    @GetMapping("/vacante/form")
    public String formulario(Model modelo){
        VacanteEntity  vacanteEntity = new VacanteEntity();
        modelo.addAttribute("vacantenew", vacanteEntity);
        return "formulario";
    }
    
    
    @PostMapping("vacantes")
    public String save(@ModelAttribute("vacante") VacanteEntity vacanteEntity ){
    vacanteServicio.add(vacanteEntity);
    return "redirect:/vacantes";
    
    }
    
    @GetMapping("/vacante/update")
    public String formEdit(@PathVariable Long id, Model modelo){
        modelo.addAttribute("vacante", vacanteServicio.findById(id));
        return "editForm";
    }
    
    @PostMapping("/vacante/{id}")
    public String update(@PathVariable Long id, @ModelAttribute("vacante") VacanteEntity vacanteEntity){
        VacanteEntity vacanteEntity1 = vacanteServicio.update(vacanteEntity);
        vacanteEntity1.setDescripcion(vacanteEntity.getDescripcion());        
        return "redirect:/vacantes";
    
    }
    
    @GetMapping("/vacante/{id}")
    public  String delete(@PathVariable Long id){
        vacanteServicio.delete(id);
        return "redirect:/home";
    }
    
    
    
}
