package com.curso.persistence.mapper;

import com.curso.persistence.models.Coche;

/**
 * 
 * @author 4c0de
 * 
 *
 */

public interface CochesMapper {

	/**
	 * Servicio que devuelve todo el contenido almacenado en la bbdd
	 
	 * @return Devolvemos una lista con todos los coches de la bbdd
	 */
	public Iterable<Coche> devolverLista();
	
	
	/**
	 * Método que borra todos los elementos correspondientes al id recibido como parámetro
	 * @param id ---> recibe el id de coche único.
	 */
	
	public void borrar(int id);
	
	
	/**
	 * Método que recibe como argumento un objeto de tipo coche y lo salva en la bbdd
	 * @param coche--->Objeto de tipo Coche.
	 * @return---->Devuelve el objeto Coche.
	 */
	
	public Coche insertar(Coche coche);
	
}
