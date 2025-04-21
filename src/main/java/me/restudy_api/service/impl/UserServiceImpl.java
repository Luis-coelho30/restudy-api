package me.restudy_api.service.impl;

import me.restudy_api.domain.model.User;
import me.restudy_api.domain.repository.UserRepository;
import me.restudy_api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("This User ID already exists");
        }
        return userRepository.save(userToCreate);
    }
}
