package com.ifsuldeminas.HelpPet.controller;

import com.ifsuldeminas.HelpPet.model.entity.Pessoa;
import com.ifsuldeminas.HelpPet.model.entity.Pet;
import com.ifsuldeminas.HelpPet.model.entity.repositories.PessoaRepository;
import com.ifsuldeminas.HelpPet.model.entity.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimento")
public class PetController {

    private PetRepository petRepository;

    public PetController(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    //implementacao de metodos para tratamento das requisicoes correspondentes
    //`as operacoes CRUD para Pet:

    //operacoes Read:

    //obtem uma lista das pessoas cadastradas
    @GetMapping
    public List<Pet> list(){
        //fazer uma consulta no BD
        return petRepository.findAll();
    }

    //obtem dados de um plano
    @GetMapping("/{id}")
    public Pet show(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //fazer uma busca no BD pelo id do plano
        return petRepository.getById(id);
    }

    //operacao Create
    @PostMapping
    public Pet save(@RequestBody Pet pet){
        //posteriormente: implementar tratamento de erros

        //cadastrar o pessoa no BD
        return petRepository.save(pet);
    }

    //operacao Update
    @PutMapping("/{id}")
    public Pessoa update(@PathVariable Long id, @RequestBody Pessoa pessoa){
        //posteriormente: implementar tratamento de erros

        //buscar o pessoa no BD
        Pessoa PessoaAux = pessoaRepository.getById(id);
        //atualizar os dados da Pessoa
        PessoaAux.setNome(pessoa.getNome());
        PessoaAux.setEndereco(pessoa.getEndereco());
        PessoaAux.setEmail(pessoa.getEmail());
        PessoaAux.setCpf_cnpj(pessoa.getEmail());
        PessoaAux.setTelefone(pessoa.getTelefone());
        //atualizar os dados do plano no BD
        return pessoaRepository.save(PessoaAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //excluir o plano no BD pelo id
        pessoaRepository.deleteById(id);
    }
}