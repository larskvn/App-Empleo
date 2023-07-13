package com.empleos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;

}
