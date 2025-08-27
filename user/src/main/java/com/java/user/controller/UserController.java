package com.java.user.controller;

import com.java.user.model.Utilisateur;
import com.java.user.repository.userRepository;
import com.java.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    userRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/user/{userName}")
    public Utilisateur getUser(@PathVariable("userName") String userName) {
        return this.userRepository.findByLogin(userName);
    }

    @GetMapping("/utilisateurs")
    public Iterable<Utilisateur> getAllUsers(){
        return this.userRepository.findAll();
    }

    @PostMapping("/req/signup")
    public ResponseEntity<Utilisateur> signup(@RequestBody Utilisateur user){
        Utilisateur userCreated = this.userService.signup(user);
        if(null == userCreated){
            return new ResponseEntity<Utilisateur>(HttpStatus.CONFLICT);
        }else{
            return new ResponseEntity<Utilisateur>(userCreated, HttpStatus.CREATED);
        }
    }
}
