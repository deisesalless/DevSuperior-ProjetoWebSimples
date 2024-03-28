package br.com.devsuperior.exercicio.controller;

import br.com.devsuperior.exercicio.entities.User;
import br.com.devsuperior.exercicio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/create-user")
    public void create() {

    }

    @GetMapping
    public void read() {

    }


    public void update() {

    }


    public void delete() {

    }
}
