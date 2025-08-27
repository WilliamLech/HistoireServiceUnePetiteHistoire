package com.java.user.repository;

import com.java.user.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<Utilisateur, Integer> {

    public Utilisateur findByLogin(String username);
}
