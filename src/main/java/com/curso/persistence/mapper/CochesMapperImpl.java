package com.curso.persistence.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.persistence.models.Coche;
import com.curso.persistence.models.CocheRepo;

/**
 * 
 * @author 4c0de
 * 
 *
 */

@Service
public class CochesMapperImpl implements CochesMapper  {
	
	//inyectamos CocheRepo para hacer uso de la bbdd
	@Autowired
	CocheRepo cRepo;
	
	
	@Override
	public Iterable<Coche> devolverLista() {
		
		return cRepo.findAll();
	}


	@Override
	public void borrar(int id) {
		cRepo.delete(id);
		
	}


	@Override
	public Coche insertar(Coche coche) {
		  cRepo.save(coche);
		return coche;
	}



	

}