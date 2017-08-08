package com.curso.persistence.models;

import org.springframework.data.repository.CrudRepository;

import com.curso.persistence.models.Coche;


/**
 * 
 * @author 4c0de
 * 
 *
 */
public interface CocheRepo extends CrudRepository<Coche, Integer> {

}
