package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String tipo_atendimento;
    private float valor;
    private int prioridade;
    @ManyToOne
    private Medico medico;
    private Pet pet;

}
