package com.utn.controller;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

@Controller
@SessionAttributes("form")
public class ArchivoController {
	
	@ModelAttribute
	public void addModelo(Model model){
		if(!model.containsAttribute("form")){
			//objeto 
			model.addAttribute("obj","nuevo obj");
		}
	}

	@RequestMapping("getcookie")
	public String getCoockie(@CookieValue("someCookie") String cookie){
		
		return "vista";
	}
	
	@RequestMapping("/formularioFoto")
	public String formu(){
		return "myForm";
	}
	
	@RequestMapping(value="/handlerForm", method = RequestMethod.POST)
	public String handle(@RequestParam("file") MultipartFile file){
		
		try {
			if(!file.isEmpty()){
				byte[] b = file.getBytes();
				FileOutputStream out = new FileOutputStream("log.txt");
				out.write(b);
				out.flush();
				out.close();
				System.out.println("se guardo");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:complete.html";
	}
	
	@RequestMapping(value="/complete")
	public String complete(){
		return "completed";
	}
}
