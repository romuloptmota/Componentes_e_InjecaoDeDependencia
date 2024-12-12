package com.javaspringprofessional.desafio01;

import com.javaspringprofessional.desafio01.entities.Ordem;
import com.javaspringprofessional.desafio01.services.ValorTotal;
import com.javaspringprofessional.desafio01.services.ValorTransporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;


@SpringBootApplication
@ComponentScan({"com.javaspringprofessional"})
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	ValorTotal valorTotal;

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);

		Ordem ordem = new Ordem(2282, 800.00, 10.0);
		double total = valorTotal.total(ordem);

		System.out.printf(ordem.toString(), total);


	}
}
