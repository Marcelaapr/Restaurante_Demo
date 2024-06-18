package com.example.demo.controller;

import com.example.demo.model.Garcom;
import com.example.demo.service.GarcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/garcom")
public class GarcomController {
    @Autowired
    private GarcomService garcomService;

    @GetMapping("/testeg")
    public String testeg() {
        return "Teste do garçom com sucesso!";
    }

    @PostMapping
    public Garcom cadastrarGarcom(Garcom garcom) {
        return garcomService.cadastrarGarcom(garcom);
    }

    @GetMapping
    public List<Garcom> getAllGarcons() {
        return garcomService.getAllGarcons();
    }



}
