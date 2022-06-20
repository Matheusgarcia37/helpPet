package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Medico")
public class Medico extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_vet;
    @OneToMany(mappeBy="medico")
    private Set<Atendimento> atendimentos;
}
