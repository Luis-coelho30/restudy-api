package me.restudy_api.service;

import me.restudy_api.domain.model.User;

public interface UserService {

    public User findById(Long id);

    public User create(User userToCreate);
}
