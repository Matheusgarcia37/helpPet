package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Cliente cliente;
    private Set<Atendimento> atendimentos;

}
