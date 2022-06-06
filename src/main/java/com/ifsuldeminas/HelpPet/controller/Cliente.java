package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Cliente extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_cliente;
    private Set<Pet> pets;
}
