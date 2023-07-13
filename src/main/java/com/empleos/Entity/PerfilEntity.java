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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity(name = "PerfilEntity")
@Table(name = "perfil")
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "perfil")
    private String perfil;

    @ManyToMany(mappedBy = "perfil")
    private List<UsuariosEntity> usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public List<UsuariosEntity> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<UsuariosEntity> usuario) {
        this.usuario = usuario;
    }

    public PerfilEntity(Long id, String perfil, List<UsuariosEntity> usuario) {
        this.id = id;
        this.perfil = perfil;
        this.usuario = usuario;
    }

    public PerfilEntity(String perfil, List<UsuariosEntity> usuario) {
        this.perfil = perfil;
        this.usuario = usuario;
    }

    public PerfilEntity() {
    }

}
