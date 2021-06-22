package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Pais;
@Repository
public interface IpaisDao extends CrudRepository<Pais,Long>{
//Recordar repasar metodos de CRUDREPOSITORY
	//Aqui escribir cualquier logica del negocio q se requiera(query)
}
