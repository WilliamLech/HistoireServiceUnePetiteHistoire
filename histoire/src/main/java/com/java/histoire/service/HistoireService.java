package com.java.histoire.service;

import com.java.histoire.model.Histoire;
import com.java.histoire.repository.HistoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistoireService {
    @Autowired
    private HistoireRepository histoireRepository;

    public Iterable<Histoire> getProducts() {
        return histoireRepository.findAll();
    }

    public Optional<Histoire> getProductById(Long id) {
        return histoireRepository.findById(id);
    }
}
