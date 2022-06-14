package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")

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
