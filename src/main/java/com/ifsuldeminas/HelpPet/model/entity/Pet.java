package com.ifsuldeminas.HelpPet.model.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String raca;
    private int idade;
    private float peso;
    private String especie;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy="pet")
    private Set<Atendimento> atendimentos;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Set<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}
