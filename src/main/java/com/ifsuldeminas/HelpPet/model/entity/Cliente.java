package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Cliente")
public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_cliente;
    @OneToMany(mappeBy="cliente")
    private Set<Pet> pets;
}
