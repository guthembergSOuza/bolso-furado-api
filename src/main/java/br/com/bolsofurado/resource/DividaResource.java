package br.com.bolsofurado.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bolsofurado/dividas")
public class DividaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listarDividas() {
		return "dividas ... . ";
	}
	
	
}
