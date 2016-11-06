package com.utn.controller;

import java.applet.AppletContext;

import javax.validation.Valid;

import org.hibernate.validator.spi.resourceloading.ResourceBundleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utn.modelo.Alumno;
import com.utn.modelo.Persona;

@Controller
public class SaludoController {

//	@Autowired
	private Persona persona;
	
	
	public Persona getPersona() {
		return persona;
	}

	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	@RequestMapping(value = "/saludo")
	public String saluda(Model modelo) {
		
		
		persona.setNombre("pepito");
//		persona.setApellido("asdasd");
		modelo.addAttribute("saludo", "hola " + persona.getNombre() + " " + persona.getApellido());
		return "saludo";
	}
	
	@RequestMapping(value="alumnoForm")
	public String formAlumnosRquest(@Valid @ModelAttribute("nuevoAlumno") Alumno alumno,BindingResult result){
		
		if(result.hasErrors()){
			System.out.println("tiene erroros");
			return "alumnoFormReq";
		}
		
		System.out.println(alumno.getNombre());
		return "alumnoFormReq";
	}
	
	public String formAlumno(Model model){
		
		return "alumnoForm";
	}
}
