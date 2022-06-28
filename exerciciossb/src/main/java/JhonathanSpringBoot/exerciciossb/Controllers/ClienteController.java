package JhonathanSpringBoot.exerciciossb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JhonathanSpringBoot.exerciciossb.Models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "qualquer")
	public Cliente obterCliente() {
		
		return new Cliente(21, "Thamires", "123.456.789-00");
		
	}

}
