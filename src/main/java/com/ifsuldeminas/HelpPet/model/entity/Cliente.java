package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "Cliente")
public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_cliente;
    @OneToMany(mappedBy="cliente")
    private Set<Pet> pets;
}
