package com.example.demo.service;
import com.example.demo.model.Garcom;
import com.example.demo.repository.GarcomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarcomService {
    @Autowired
    private GarcomRepository garcomRepository;

    public Garcom cadastrarGarcom(Garcom garcom) {
        return garcomRepository.save(garcom);
    }

    public List<Garcom> getAllGarcons() {
        return garcomRepository.findAll();
    }



}
