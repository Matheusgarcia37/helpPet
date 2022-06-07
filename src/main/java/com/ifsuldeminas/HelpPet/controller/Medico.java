package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Medico extends Pessoa {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private int cod_vet;
    @OneToMany
    @JoinColumn(name="medico_id")
    private Set<Atendimento> atendimentos;
}
