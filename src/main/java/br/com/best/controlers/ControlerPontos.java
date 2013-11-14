package br.com.best.controlers;

import java.awt.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControlerPontos {

	@RequestMapping("/pontos")
	public @ResponseBody
	String name() {

		String ponto = "[{\"Id\": 1,  \"Latitude\": -24.0273973447393, \"Longitude\": -52.01225890527951,\"Descricao\": \"Conteúdo do InfoBox 1\",\"Imagen\" : \"/best/resources/img/supermarket.png\",\"Hint\": \" Meu Hint Personalizado <br> Mo fera\" },";
		String ponto1 = "{\"Id\": 1,  \"Latitude\": -24.027607300303135, \"Longitude\": -52.010970355169661,\"Descricao\": \"Conteúdo do InfoBox 1\",\"Imagen\" : \"/best/resources/img/supermarket.png\",\"Hint\": \" Meu Hint Personalizado <br> Mo fera\" },";
		
		String ponto2 = "{\"Id\": 1,  \"Latitude\": -24.0224136322735, \"Longitude\": -52.00180792917479,\"Descricao\": \"Conteúdo do InfoBox 1\",\"Imagen\" : \"/best/resources/img/phones.png\",\"Hint\": \" Meu Hint Personalizado <br> Mo fera\" }]";

		return ponto + ponto1 + ponto2;

	}

}
