package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Medico")
public class Medico extends Pessoa {
    private int cod_vet;
    //private Set<Atendimento> atendimentos;
}
