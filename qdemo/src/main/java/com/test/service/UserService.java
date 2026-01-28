package com.test.service;



import java.util.List;

import com.test.dto.User;
import com.test.repository.UserRepository;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService {

	private final UserRepository repository;

	@Inject
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll().list();
    }

    @Transactional
    public User create(User user) {
        repository.persist(user);
        return user;
    }
}
