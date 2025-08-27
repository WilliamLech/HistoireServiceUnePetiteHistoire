package com.java.histoire.repository;

import com.java.histoire.model.Histoire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoireRepository extends CrudRepository<Histoire, Long> {
}
