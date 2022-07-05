package com.example.demo.service;

import com.example.demo.dto.Pisica;
import com.example.demo.repo.PisicaRepo;
import org.springframework.stereotype.Service;

@Service
public class PisicaService {

    private final PisicaRepo pisicaRepo;

    public PisicaService(PisicaRepo pisicaRepo) {
        this.pisicaRepo = pisicaRepo;
    }

//    @Cacheable("student")
//    public Pisica getPisica(String id){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        return new Pisica(id);
//    }

    public Pisica getPisica(Integer id) {
        return pisicaRepo.findById(id).orElse(null);
    }

    public Pisica save(Pisica pisica) {
        return pisicaRepo.save(pisica);
    }
}
