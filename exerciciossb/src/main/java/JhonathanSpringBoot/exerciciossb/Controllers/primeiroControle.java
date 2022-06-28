package JhonathanSpringBoot.exerciciossb.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeiroControle {

	@GetMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "Ola Spring Boot";
	}
}
