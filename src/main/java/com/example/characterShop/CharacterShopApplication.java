package com.example.characterShop;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.characterShop.model.Charactere;
import com.example.characterShop.repository.CharacterRepository;

@SpringBootApplication
public class CharacterShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharacterShopApplication.class, args);
	}
    @Bean
    ApplicationRunner init(CharacterRepository repository) {
        return args -> {
            Stream.of(new Charactere(null, "Name1", "charClass1"), new Charactere(null, "A Brief History of Time", "Stephen Hawking"),
                    new Charactere(null, "Brave New World", "Aldous Huxley")).forEach(charactere -> {
                repository.save(charactere);
            });
        };
    }
}
