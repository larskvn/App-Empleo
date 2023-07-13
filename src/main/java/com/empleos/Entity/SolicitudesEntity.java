/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity(name = "SolicitudesEntity")
@Table(name = "solicitudes")
public class SolicitudesEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha")
    private LocalDate fecha;
    
    private String archivo;
    
    private String comentario;
    
    
    @ManyToOne
    @JoinColumn(name = "idVacante", nullable = false)
    private VacanteEntity idVacante;
    
    
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private UsuariosEntity idUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public VacanteEntity getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(VacanteEntity idVacante) {
        this.idVacante = idVacante;
    }

    public UsuariosEntity getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuariosEntity idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SolicitudesEntity(Long id, LocalDate fecha, String archivo, String comentario, VacanteEntity idVacante, UsuariosEntity idUsuario) {
        this.id = id;
        this.fecha = fecha;
        this.archivo = archivo;
        this.comentario = comentario;
        this.idVacante = idVacante;
        this.idUsuario = idUsuario;
    }

    public SolicitudesEntity(LocalDate fecha, String archivo, String comentario, VacanteEntity idVacante, UsuariosEntity idUsuario) {
        this.fecha = fecha;
        this.archivo = archivo;
        this.comentario = comentario;
        this.idVacante = idVacante;
        this.idUsuario = idUsuario;
    }

    public SolicitudesEntity() {
    }
    
    
    
    
}
