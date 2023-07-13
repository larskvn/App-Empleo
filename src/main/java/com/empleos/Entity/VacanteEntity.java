/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleos.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;




@Entity(name = "VacanteEntity")
@Table(name = "vacante")
public class VacanteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private  String nombre;
    
    @Column(name = "descripcion")
    private  String descripcion;
    
    @Column(name = "fecha")
    private LocalDate fecha;

    @PrePersist
    public void prePersist() {
        fecha = LocalDate.now();

    }
    
    @Column(name = "salario")
    private  Double salario;
    
    @Column(name = "status", columnDefinition = "boolean default true")
    private Boolean status = true;
    
    @Column(name = "destacado")
    private  Integer destacado;
    
    @Column(name = "imagen")
    private String imagen;
    
    @Column(name = "detalle")
    private String detalle;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private CategoriaEntity idCategoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public CategoriaEntity getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaEntity idCategoria) {
        this.idCategoria = idCategoria;
    }

    public VacanteEntity(Long id, String nombre, String descripcion, LocalDate fecha, Double salario, Boolean status, Integer destacado, String imagen, String detalle, CategoriaEntity idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.salario = salario;
        this.status = status;
        this.destacado = destacado;
        this.imagen = imagen;
        this.detalle = detalle;
        this.idCategoria = idCategoria;
    }

    public VacanteEntity(String nombre, String descripcion, LocalDate fecha, Double salario, Boolean status, Integer destacado, String imagen, String detalle, CategoriaEntity idCategoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.salario = salario;
        this.status = status;
        this.destacado = destacado;
        this.imagen = imagen;
        this.detalle = detalle;
        this.idCategoria = idCategoria;
    }

    public VacanteEntity(String nombre, String descripcion, Double salario, Integer destacado, String imagen, String detalle) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.salario = salario;
        this.destacado = destacado;
        this.imagen = imagen;
        this.detalle = detalle;
    }

    
    
    public VacanteEntity() {
    }

}
