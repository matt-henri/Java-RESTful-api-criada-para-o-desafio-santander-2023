package me.dio.SantanderApiRest.service;

import me.dio.SantanderApiRest.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    User create(User userToCreate);

    User update(Long id, User userToUpdate);

    void delete(Long id);
}
