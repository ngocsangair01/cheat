package com.example.treat.controllers;

import com.example.treat.daos.Listen;
import com.example.treat.daos.Read;
import com.example.treat.dtos.ListenDTO;
import com.example.treat.dtos.ReadDTO;
import com.example.treat.repositories.ListenRepository;
import com.example.treat.repositories.ReadRepository;
import com.example.treat.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reads")
public class ReadController {
    @Autowired
    private ReadRepository readRepository;

    @PostMapping
    public ResponseEntity<?> createRead(@RequestBody ReadDTO readDTO){
        Read read = new Read();
        Convert.fromReadDTOToRead(readDTO,read);
        return ResponseEntity.status(201).body(readRepository.save(read));
    }

    @GetMapping
    public ResponseEntity<?> getAllRead(){
        return ResponseEntity.status(200).body(readRepository.findAll());
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllRead(){
        readRepository.deleteAll();
        return ResponseEntity.status(200).body("Success");
    }
}
