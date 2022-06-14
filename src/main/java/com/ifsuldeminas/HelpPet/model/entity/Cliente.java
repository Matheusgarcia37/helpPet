package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Cliente")
public class Cliente extends Pessoa {
    private int cod_cliente;
    //private Set<Pet> pets;
}
