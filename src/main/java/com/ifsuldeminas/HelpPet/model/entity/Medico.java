package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "Medico")
public class Medico extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int cod_vet;
    @OneToMany(mappedBy="medico")
    private Set<Atendimento> atendimentos;
}
