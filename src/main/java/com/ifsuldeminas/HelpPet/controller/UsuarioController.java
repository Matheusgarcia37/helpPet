package com.ifsuldeminas.HelpPet.controller;

import com.ifsuldeminas.HelpPet.model.entity.Usuario;
import com.ifsuldeminas.HelpPet.model.entity.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //implementacao de metodos para tratamento das requisicoes correspondentes
    //`as operacoes CRUD para Pet:

    //operacoes Read:

    //obtem uma lista das pessoas cadastradas
    @GetMapping
    public List<Usuario> list(){
        //fazer uma consulta no BD
        return usuarioRepository.findAll();
    }

    //obtem dados de um plano
    @GetMapping("/{id}")
    public Usuario show(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //fazer uma busca no BD pelo id do plano
        return usuarioRepository.getById(id);
    }

    //operacao Create
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        //posteriormente: implementar tratamento de erros

        //cadastrar o pet no BD
        return usuarioRepository.save(usuario);
    }

    //operacao Update
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario){
        //posteriormente: implementar tratamento de erros

        //buscar o pessoa no BD
        Usuario UsuarioAux = usuarioRepository.getById(id);
        //atualizar os dados da Pet
        UsuarioAux.setLogin(usuario.getLogin());
        UsuarioAux.setSenha(usuario.getSenha());

        //atualizar os dados do plano no BD
        return usuarioRepository.save(UsuarioAux);
    }

    //operacao Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        //posteriormente: implementar tratamento de erros

        //excluir o plano no BD pelo id
        usuarioRepository.deleteById(id);
    }
}