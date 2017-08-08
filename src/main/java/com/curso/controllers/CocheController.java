package com.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.persistence.models.Coche;
import com.curso.persistence.services.CochesService;


/**
 * 
 * @author 4c0de
 * 
 *
 */

@Controller
public class CocheController {
	
    //inyectamos CochesService para utilizar los métodos implementados
	@Autowired
	private CochesService cocheService;
	
	
	@RequestMapping(value={"/login"})
	public String login() {
		
		
		return "/index";
	}
	
	@RequestMapping(value={"/logout"})
	public String logout() {
		
		
		return "/index";
	}
	

	//Mapeamos admin
	@RequestMapping(value={"/admin"})
	public String admin() {
		
	   return "/admin";
	}
	
	
	//Mapeamos lista
	@RequestMapping(value={"/lista"})
	public String lista(Model model) {
		
		//Guardamos la llamada a cocheService.listar() en un List
		List<Coche> listaCoches= (List<Coche>) cocheService.listar();
		model.addAttribute("resultado", listaCoches);
		
	   return "lista";
	}
	
	
	@RequestMapping(value = "/borrar/{id}")
	public String borrar(Model model, @PathVariable(name="id") Integer id) {
		cocheService.borrarId(id);
		
		//el redirect es para redireccionar a la url que queramos...no a una pagina url sino
		//a una url del mapping del controlador!!!!
		return "redirect:/lista";
	}
	
	//Mapeamos añadir vehiculo
	@RequestMapping(value={"/add"})
	public String add() {
		
	   return "/add";
	}
	
	//Mapeamos buscar
	@RequestMapping(value={"/buscar"})
	public String buscar() {
		
	   return "/buscar";
	}
	
	//Método para la busqueda de objetos en la base de datos
	@RequestMapping(value = "/busqueda",  method = RequestMethod.POST)
	public String busqueda(Model modelo, @RequestParam(name = "buscar") String search)
		 {
            
		//llamamos al metodo buscarCoche
             List<Coche> lista=cocheService.buscarCoche(search);
		
			modelo.addAttribute("mensaje", lista);
			

		return "/buscar";
	}
	
	
	//Método para la creación de un vehiculo en la base de datos
	@RequestMapping(value = "/addVehiculo",  method = RequestMethod.POST)
	public String addCoche(Model modelo, @RequestParam(name = "imagen") String img,
			@RequestParam(name = "marca") String trade ,
			@RequestParam(name = "color") String colour,
			@RequestParam(name = "year") String anno,
			@RequestParam(name = "potencia") String pot,
			@RequestParam(name = "combustible") String combus,
			@RequestParam(name = "precio") String prec,
			@RequestParam(name = "modelo") String model) {
            
		//llamamos al metodo crearCoche en CochesService
            Coche coche=cocheService.crearCoche(model,img,trade,colour,anno,pot,combus,prec);
		
			modelo.addAttribute("mensaje", "El coche ha sido correctamente guardado en la base de datos");
			modelo.addAttribute("creado", coche);

		return "/add";
	}

	

	
}
