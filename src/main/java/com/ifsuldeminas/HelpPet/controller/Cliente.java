package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cliente extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_cliente;
    @OneToMany
    @JoinColumn(name="cliente_id")
    private Set<Pet> pets;
}
