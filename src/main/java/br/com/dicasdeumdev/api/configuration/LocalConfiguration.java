package br.com.dicasdeumdev.api.configuration;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfiguration {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User user1 = new User(null, "Willian", "Willian@gmail.com", "123");
        User user2 = new User(null, "Luiz", "Luiz@gmail.com", "123");

        repository.saveAll(List.of(user1, user2));
    }

}
