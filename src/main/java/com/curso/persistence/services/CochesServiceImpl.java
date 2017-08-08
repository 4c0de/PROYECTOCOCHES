package com.curso.persistence.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.persistence.mapper.CochesMapper;
import com.curso.persistence.models.Coche;



@Service
public class CochesServiceImpl implements CochesService{
	
	//inyectamos CochesMapper para utilizar los métodos implementados
	@Autowired
	private CochesMapper cochesMapper;

	@Override
	public Iterable<Coche> listar() {
		
		return cochesMapper.devolverLista();
	}

	@Override
	public void borrarId(int id) {
		cochesMapper.borrar(id);
		
	}

	@Override
	public Coche crearCoche( String model,String img, String trade,String colour,String anno,String pot,String combus,String prec) {
	
		
		  Coche coche = new Coche(model,img,trade,colour,anno,pot,combus,prec);
		 
		
		
		return cochesMapper.insertar(coche);
		
	}

	@Override
	public List<Coche> buscarCoche(String buscar) {
	       Iterable<Coche> lista = cochesMapper.devolverLista();
	       List<Coche> listaDevolver = new ArrayList<Coche>();
	    
	       for (Coche c : lista) {
	    	   
	    	     if ((c.getMarca().equals(buscar)) || (c.getModelo().equals(buscar)) || (c.getYear().equals(buscar))) {
	    	    	 listaDevolver.add(c);
	    	     }
			
		}
	       
		return listaDevolver;
	}

}
