package com.dio.jpa;

import com.dio.jpa.brinquedos.Brinquedo;
import com.dio.jpa.brinquedos.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	private BrinquedoRepository brinquedoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Brinquedo novoBrinquedo = new Brinquedo("Boneca", "Azul", 5);
		Brinquedo novoBrinquedo2 = new Brinquedo("Lego", "RGB", 20);
		brinquedoRepository.save(novoBrinquedo);
		brinquedoRepository.save(novoBrinquedo2);
	}
}
