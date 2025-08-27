package com.java.user.service;

import com.java.user.model.Utilisateur;
import com.java.user.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    userRepository userRepository;

    public Utilisateur signup(Utilisateur user){
        // Vérifier si l'utilisateur existe déjà
        Utilisateur existingUser = this.userRepository.findByLogin(user.getLogin());
        if (existingUser != null) {
            return null; // 409 Conflict
        }

        // Assigner un rôle par défaut si pas défini
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("USER");
        }

        // Sauvegarder le nouvel utilisateur
        Utilisateur savedUser = this.userRepository.save(user);
        return savedUser;
    }

}
