package com.curso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author 4c0de
 * Controlador para manejar los mapping de ventanas de errores
 *
 */

public class ErrorController {
	
	
	@Controller
	public class NotFoundController {
	    @RequestMapping("/error.html")
	    public String render404(Model model) {
	     
	        return "error";
	    }
	}
	

}
