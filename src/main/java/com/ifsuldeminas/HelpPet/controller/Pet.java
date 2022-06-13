package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;


import java.util.Set;
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String raca;
    private int idade;
    private float peso;
    private String especie;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy="pet")
    private Set<Atendimento> atendimentos;

}
