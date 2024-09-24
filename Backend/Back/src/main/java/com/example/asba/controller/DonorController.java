package com.example.back.controller;


import com.example.back.model.Donor;
import com.example.back.model.Visiteur;
import com.example.back.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/donor")
@CrossOrigin
public class DonorController {
    @Autowired
    private DonorService donorService;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Donor donor) {
        System.out.println(donor.toString());
        donorService.saveDonor(donor);
        Map<String, String> response = new HashMap<>();
        response.put("message", "New Donor is Added");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
