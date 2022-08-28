package com.los_Turneados.Innova.Soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InnovaSoftApplication {
	@GetMapping("/hello")
	public String hello(){
		return "Hola mundo"

	}


	public static void main(String[] args) {
		SpringApplication.run(InnovaSoftApplication.class, args);
	}

}
