package com.ifsuldeminas.HelpPet.controller;

import javax.persistence.*;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String endereco;
    private String email;
    private long telefone;
    private String cpf_cnpj;
    @OneToOne(mappedBy = "pessoa")
    private Usuario usuario;
}
