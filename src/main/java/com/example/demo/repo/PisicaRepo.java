package com.example.demo.repo;

import com.example.demo.dto.Pisica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisicaRepo extends CrudRepository<Pisica,Integer> {
}
