package com.jonathan.brito.spring.boot.dao;

import org.springframework.stereotype.Repository;

import com.jonathan.brito.spring.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
