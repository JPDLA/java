package com.utn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CCController {

	
	@RequestMapping(value="/prueba" , params="!pepe", headers="")
	public String mapea(){
		
		return "prueba";
	}
}
