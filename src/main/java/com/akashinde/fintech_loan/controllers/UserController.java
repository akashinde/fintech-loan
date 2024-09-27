package com.akashinde.fintech_loan.controllers;

// custom
import com.akashinde.fintech_loan.entities.UserEntity;
import com.akashinde.fintech_loan.repositories.UserRepository;
// spring framework
import org.springframework.web.bind.annotation.*;
// other
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) this.userRepository.findAll();
    }

    @GetMapping(params = "id")
    public UserEntity getUserById(@RequestParam(required = false) long id) {
        return this.userRepository.findById(id);
    }

    @GetMapping(params = "name")
    public List<UserEntity> getUsersByName(@RequestParam(required = false) String name) {
        return this.userRepository.findByName(name);
    }

    @PostMapping
    void addUser(@RequestBody UserEntity user) {
        this.userRepository.save(user);
    }
}
