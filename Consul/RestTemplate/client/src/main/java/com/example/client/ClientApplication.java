package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Maria ", Float.parseFloat("20")));
            clientRepository.save(new Client(Long.parseLong("2"), "Manal L", Float.parseFloat("29")));
            clientRepository.save(new Client(Long.parseLong("3"), "Fatima f", Float.parseFloat("21")));
        };
    }
}
