package com.example.demo.repository;

import com.example.demo.model.Garcom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarcomRepository extends JpaRepository <Garcom, Long> {

}
