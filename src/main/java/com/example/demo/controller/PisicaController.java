package com.example.demo.controller;

import com.example.demo.dto.Pisica;
import com.example.demo.service.PisicaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class PisicaController {

     private final PisicaService pisicaService;

    public PisicaController(PisicaService pisicaService) {
        this.pisicaService = pisicaService;
    }

    @GetMapping("/pisica/{id}")
    public Pisica getPisica(@PathVariable Integer id){
        return pisicaService.getPisica(id);
    }


    @PostMapping("/pisica")
    public Pisica savePisica(@RequestBody  Pisica pisica){
        return pisicaService.save(pisica);
    }

}
