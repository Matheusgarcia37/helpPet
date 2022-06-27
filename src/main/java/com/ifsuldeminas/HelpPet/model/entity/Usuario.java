package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String login;
    private String senha;
    @OneToOne
    private Pessoa pessoa;
}

