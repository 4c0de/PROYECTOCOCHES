package com.curso.persistence.services;

import java.util.List;

import com.curso.persistence.models.Coche;

public interface CochesService {
	

	
	/**
	 *  Método que devuelve una lista con todos los coches en la bbdd.
	 *  Llamada a devolverLista de CochesMapper
	 *  
	 * @return 
	 */
	public Iterable<Coche> listar();
	
	
	/**
	 * Método que recibe una id que se pasará a CocheMapper para borrarlo de la bbdd
	 * @param int id----> id única de coche.
	 
	 */
	public void  borrarId(int id);
	
	/**
	 * Método que recibe una serie de argumentos para la creación de un objeto de tipo Coche.
	 * @param imagen--->Imagen del coche.Que recibe de tipo String.
	 * @param marca---->Marca del coche.Que recibe como parámetro de tipo String.
	 * @param color---->Color del coche.Que recibe como parámetro de tipo String.
	 * @param year------>Año del coche.Que recibe como parámetro de tipo String.
	 * @param potencia--->Potencia del coche.Que recibe como parámetro de tipo String.
	 * @param combustible--->Combustible del coche.Que recibe como parámetro de tipo String.
	 * @param precio--->Precio del coche. Que recibe como parámetro de tipo String.
	 * @param modelo--->Modelo del coche. Recibe como parámetro de tipo String.
	 * @return --->Devuelve un objeto de tipo Coche.
	 */
	public Coche crearCoche( String model,String img,String trade,String colour,String anno,String pot,String combus,String prec);
	
	
	/**
	 * Método que recibe como parámetro un string y devuelve la lista de vehiculos que coincide con dicho Sttring.
	 * @param buscar -->String.
	 * @return-->Devuelve una lista con los objetos hallados.
	 */
	public List<Coche> buscarCoche(String buscar);
		
	
  
}
