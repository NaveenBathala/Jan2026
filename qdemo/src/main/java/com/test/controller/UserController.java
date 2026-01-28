package com.test.controller;

import java.util.List;

import com.test.dto.User;
import com.test.service.UserService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/users")
@ApplicationScoped
public class UserController {

    private final UserService service;

    @Inject
    public UserController(UserService service) {
        this.service = service;
    }

    @GET
    @Path("/getAll")
    public List<User> list() {
        return service.findAll();
    }

    @POST
    public User create(User user) {
        return service.create(user);
    }
    
}

