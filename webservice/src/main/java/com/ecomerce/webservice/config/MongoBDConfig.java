package com.ecomerce.webservice.config;

import com.ecomerce.webservice.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoBDConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return args -> {
//            usersRepository.save(new Usuario(1, "Peter", "Development", 300l));
//            usersRepository.save(new Usuario(2, "Romario", "Development", 300l));
            usersRepository.deleteAll();
        };

    }
}
