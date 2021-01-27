package com.jonathan.brito.spring.boot.dao;

import org.springframework.stereotype.Repository;

import com.jonathan.brito.spring.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
