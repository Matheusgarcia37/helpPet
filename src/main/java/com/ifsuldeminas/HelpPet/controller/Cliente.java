package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cliente extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_cliente;
    @OneToMany(mappedBy="cliente")
    private Set<Pet> pets;
}
