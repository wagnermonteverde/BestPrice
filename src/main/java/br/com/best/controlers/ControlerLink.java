package br.com.best.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlerLink {

	@RequestMapping("/mapa")
	public String inicio() {
		return "mapa";
	}
	
	
	@RequestMapping("/mapaoferta")
	public String mapa() {
		return "mapaoferta";
	}


}
