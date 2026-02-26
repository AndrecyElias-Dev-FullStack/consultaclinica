package com.projeto.consultaclinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Esta anotação diz ao Java: "Isso é um site Spring Boot!"
public class ConsultaclinicaApplication {

	public static void main(String[] args) {
		// Este comando liga o servidor e procura seus Controllers e HTMLs
		SpringApplication.run(ConsultaclinicaApplication.class, args);
		System.out.println("Servidor rodando em: http://localhost:8080/pacientes");
	}
}