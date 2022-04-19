package com.example.treat.controllers;

import com.example.treat.daos.Read;
import com.example.treat.daos.Write;
import com.example.treat.dtos.ReadDTO;
import com.example.treat.dtos.WriteDTO;
import com.example.treat.repositories.ReadRepository;
import com.example.treat.repositories.WriteRepository;
import com.example.treat.utils.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/writes")
public class WriteController {
    @Autowired
    private WriteRepository writeRepository;

    @PostMapping
    public ResponseEntity<?> createWrite(@RequestBody WriteDTO writeDTO){
        Write write = new Write();
        Convert.fromWriteDTOToWrite(writeDTO,write);
        return ResponseEntity.status(201).body(writeRepository.save(write));
    }

    @GetMapping
    public ResponseEntity<?> getAllWrite(){
        return ResponseEntity.status(200).body(writeRepository.findAll());
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllWrite(){
        writeRepository.deleteAll();
        return ResponseEntity.status(200).body("Success");
    }
}
