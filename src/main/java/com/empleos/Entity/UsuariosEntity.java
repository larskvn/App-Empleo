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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity(name = "UsuariosEntity")
@Table(name = "users")
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled ", columnDefinition = "boolean default true")
    private Boolean enabled = true ;

    @Column(name = "fechaRegistro")
    private LocalDate fechaRegistro;

    @PrePersist
    public void prePersist() {
        fechaRegistro = LocalDate.now();

    }

    @ManyToMany
    @JoinTable(name = "UsuarioPerfil",
            joinColumns = @JoinColumn(name = "idUsuario", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idPerfil", referencedColumnName = "id"))
    private List<PerfilEntity> perfil;

    /*@ManyToMany
    @JoinTable(
            name = "authorities",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id")
    )
    private List<Authority> authorities;*/


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getState() {
        return enabled;
    }

    public void setState(Boolean estatus) {
        this.enabled = enabled;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<PerfilEntity> getPerfil() {
        return perfil;
    }

    public void setPerfil(List<PerfilEntity> perfil) {
        this.perfil = perfil;
    }

    public UsuariosEntity(Long id, String nombre, String email, String username, String password, Boolean enabled, LocalDate fechaRegistro, List<PerfilEntity> perfil) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.fechaRegistro = fechaRegistro;
        this.perfil = perfil;
    }

    public UsuariosEntity(String nombre, String email, String username, String password, Boolean enabled, LocalDate fechaRegistro, List<PerfilEntity> perfil) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.fechaRegistro = fechaRegistro;
        this.perfil = perfil;
    }

    public UsuariosEntity(String nombre, String email, String username, String password) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public UsuariosEntity() {
    }

}
