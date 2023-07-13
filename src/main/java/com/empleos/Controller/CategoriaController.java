/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Controller;

import com.empleos.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    /*@GetMapping()
    public List<CategoriaEntity> findAll(){
        return categoriaService.listarTodaLasCategorias();
    }*/
    /*@GetMapping("/categoria")
    public String listarTodaLasCategorias(Model modelo) {
        modelo.addAttribute("categoria", categoriaService.listarTodaLasCategorias());
        return "home";

    }*/

    @GetMapping("/index")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String mostrarIndex(Model model) {
        return "categorias/listCategorias";
    }

// @GetMapping("/create")
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String crear() {
        return "categorias/formCategoria";
    }

//@PostMapping("/save")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion) {
        System.out.println("Categoria: " + nombre);
        System.out.println("Descripcion: " + descripcion);

        return "categorias/listCategorias";
    }

}
