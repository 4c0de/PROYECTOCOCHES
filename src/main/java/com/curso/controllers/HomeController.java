package com.curso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author 4c0de
 * 
 *Controlador mapeo / e index
 */
@Controller
public class HomeController {
	
	@RequestMapping(value={"/", "/index"})
	public String home() {
		
		return "index";
	}

}