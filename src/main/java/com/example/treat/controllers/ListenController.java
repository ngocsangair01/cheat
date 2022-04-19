package com.example.treat.controllers;

import com.example.treat.daos.Listen;
import com.example.treat.dtos.ListenDTO;
import com.example.treat.repositories.ListenRepository;
import com.example.treat.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/listens")
public class ListenController {
    @Autowired
    private ListenRepository listenRepository;

    @PostMapping
    public ResponseEntity<?> createListen(@RequestBody ListenDTO listenDTO){
        Listen listen = new Listen();
        Convert.fromListenDTOToListen(listenDTO,listen);
        return ResponseEntity.status(201).body(listenRepository.save(listen));
    }

    @GetMapping
    public ResponseEntity<?> getAllListen(){
        return ResponseEntity.status(200).body(listenRepository.findAll());
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllListen(){
        listenRepository.deleteAll();
        return ResponseEntity.status(200).body("Success");
    }
}
