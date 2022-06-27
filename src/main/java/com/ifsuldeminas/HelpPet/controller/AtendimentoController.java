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
    //`as operacoes CRUD para atendimento:

    //operacoes Read:

    //obtem uma lista dos atendimento cadastrados
    @GetMapping
    public List<Atendimento> list(){
        //fazer uma consulta no BD
        return atendimentoRepository.findAll();
    }

    //obtem dados de um atendimento
    @GetMapping("/{id}")
    public Atendimento show(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //fazer uma busca no BD pelo id do atendimento
        return atendimentoRepository.getById(id);
    }

    //operacao Create
    @PostMapping
    public Atendimento save(@RequestBody Atendimento atendimento){
        //posteriormente: implementar tratamento de erros

        //cadastrar o atendimento no BD
        return atendimentoRepository.save(atendimento);
    }

    //operacao Update
    @PutMapping("/{id}")
    public Atendimento update(@PathVariable Long id, @RequestBody Atendimento atendimento){
        //posteriormente: implementar tratamento de erros

        //buscar o atendimento no BD
        Atendimento AtendimentoAux = atendimentoRepository.getById(id);
        //atualizar os dados do atendimento
        AtendimentoAux.setTipo_atendimento(atendimento.getTipo_atendimento());
        AtendimentoAux.setData(atendimento.getData());
        //atualizar os dados do atendimento no BD
        return atendimentoRepository.save(AtendimentoAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //excluir o atendimento no BD pelo id
        atendimentoRepository.deleteById(id);
    }
}