package br.com.dicasdeumdev.api.services.implementation;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserRepository;
import br.com.dicasdeumdev.api.services.UserService;
import br.com.dicasdeumdev.api.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> object = repository.findById(id);
        return (object.orElseThrow(() -> new ObjectNotFoundException("Objeto não concentration")));
    }
}
