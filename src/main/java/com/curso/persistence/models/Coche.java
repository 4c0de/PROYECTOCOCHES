package com.curso.persistence.models;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

/**
 * 
 * @author 4c0de
 *  Creación de la clase Coche. Vamos a definir sus
 *         atributos, constructor, getters, setters and toString.
 *
 */
//Creamos la tabla de la bbdd
@Entity
@Table (name="coches")
public class Coche {

	// atributos
	@Id
	@GeneratedValue	
	int id;
	@Column(nullable=false )
	String modelo;
	@Column(nullable=false )
	String imagen;
	@Column(nullable=false )
	String marca;
	@Column(nullable=false )
	String color;
	@Column(nullable=false )
	String year;
	@Column(nullable=false )
	String potencia;
	@Column(nullable=false )
	String combustible;
	@Column (nullable=false)
	String precio;

	// Constructor por defecto
	public Coche() {
	}
	// Constructor personalizado
	
	public Coche(String modelo,String imagen, String marca, String color, String year, String potencia, String combustible,
			String precio) {
		Random aleatorio = new Random();
		this.id=aleatorio.nextInt(4);
		this.modelo = modelo;
		this.imagen = imagen;
		this.marca = marca;
		this.color = color;
		this.year = year;
		this.potencia = potencia;
		this.combustible = combustible;
		this.precio = precio;
	}
	
    //getters y setters
	
	
	public int getId() {
		return id;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	//metodo toString sobreescrito. 
	@Override
	public String toString() {
		return "Coche [id=" + id + ", modelo=" + modelo + ", imagen=" + imagen + ", marca=" + marca + ", color=" + color
				+ ", year=" + year + ", potencia=" + potencia + ", combustible=" + combustible + ", precio=" + precio
				+ "]";
	}
 

	
	
	

}
