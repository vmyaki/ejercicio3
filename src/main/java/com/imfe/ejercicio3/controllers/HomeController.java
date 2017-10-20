package com.imfe.ejercicio3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imfe.ejercicio3.pojos.Usuario;

@Controller
public class HomeController {
	
	private final String USUARIO="admin"; //Constantes
	private final String PASS="12345"; //Constantes
	
	@RequestMapping(value="/login", method=RequestMethod.POST) //Solo funciona si los datos pasados son por el método post
	public String loginp(Model model ,@RequestParam("usuario") String usuario, @RequestParam("pass") String pass) {
		
		Usuario usuario1 = new Usuario(usuario,pass); //Creamos objeto
				
		String destino="index";
		
		if(usuario1.getNombre().equals(this.USUARIO) && usuario1.getPass().equals(this.PASS)) {
			
			model.addAttribute("rdo",usuario1); //Envío el objeto mediante 'rdo' a home
			destino="home";
			
		}
		else
		{
			model.addAttribute("mensaje","Usuario y/o contraseña no válidos"); //Envío un mensaje a index mediante 'mensaje' cuando el usuario y/o contraseña no sean correctos
			destino="index";
		}
			return destino;
		
	}
	
	@RequestMapping(value="/")
		public String index () {
			return "index";
		}
	

	
	@RequestMapping(value="/home")
		public String home() {
			return "home";
		}
	
	//Si intentas hacerlo por este método, es decir, escribiéndolo directamente en la barra de navegación, nos saldrá este mensaje
	@RequestMapping(value="/login", method=RequestMethod.GET) 
	public String loging(Model model){
		model.addAttribute("mensaje","No puedes logearte así");
		return "index";
	}
}




