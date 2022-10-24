package com.example.gerenciadorFuncionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "model.repository")
@SpringBootApplication
public class GerenciadorFuncionariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorFuncionariosApplication.class, args);
	}

}
