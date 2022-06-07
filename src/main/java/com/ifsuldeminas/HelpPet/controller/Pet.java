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
    @OneToMany
    @JoinColumn(name="pet_id")
    private Set<Atendimento> atendimentos;

}
