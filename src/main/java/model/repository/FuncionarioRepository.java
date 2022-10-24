package model.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import model.Funcionario;
import model.FuncionarioSetor;




public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}

