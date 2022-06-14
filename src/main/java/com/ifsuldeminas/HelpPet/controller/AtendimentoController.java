package com.ifsuldeminas.HelpPet.controller;

import com.ifsuldeminas.HelpPet.model.entity.Atendimento;
import com.ifsuldeminas.HelpPet.model.entity.repositories.AtendimentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoController {

    private AtendimentoRepository atendimentoRepository;

    public AtendimentoController(AtendimentoRepository atendimentoRepository){
        this.atendimentoRepository = atendimentoRepository;
    }

    //implementacao de metodos para tratamento das requisicoes correspondentes
    //`as operacoes CRUD para Plano:

    //operacoes Read:

    //obtem uma lista dos planos cadastrados
    @GetMapping
    public List<Atendimento> list(){
        //fazer uma consulta no BD
        return atendimentoRepository.findAll();
    }

    //obtem dados de um plano
    @GetMapping("/{id}")
    public Atendimento show(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //fazer uma busca no BD pelo id do plano
        return atendimentoRepository.getById(id);
    }

    //operacao Create
    @PostMapping
    public Atendimento save(@RequestBody Atendimento plano){
        //posteriormente: implementar tratamento de erros

        //cadastrar o plano no BD
        return atendimentoRepository.save(plano);
    }

    //operacao Update
    @PutMapping("/{id}")
    public Atendimento update(@PathVariable Long id, @RequestBody Atendimento atendimento){
        //posteriormente: implementar tratamento de erros

        //buscar o plano no BD
        Atendimento AtendimentoAux = atendimentoRepository.getById(id);
        //atualizar os dados do plano
        AtendimentoAux.setTipo_atendimento(atendimento.getTipo_atendimento());
        AtendimentoAux.setData(atendimento.getData());
        //atualizar os dados do plano no BD
        return atendimentoRepository.save(AtendimentoAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //excluir o plano no BD pelo id
        atendimentoRepository.deleteById(id);
    }
}