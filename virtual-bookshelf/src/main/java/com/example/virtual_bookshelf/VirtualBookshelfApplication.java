package com.example.virtual_bookshelf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VirtualBookshelfApplication {

	public static void main(String[] args) {
		System.out.println("olá");
		SpringApplication.run(VirtualBookshelfApplication.class, args);
	}

}
