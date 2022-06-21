package com.ifsuldeminas.HelpPet.model.entity.repositories;

import com.ifsuldeminas.HelpPet.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
