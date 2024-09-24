package com.example.back.controller;

import com.example.back.model.Visiteur;
import com.example.back.service.VisiteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/visiteur")
@CrossOrigin
public class VisiteurController {
    @Autowired
    private VisiteurService visiteurService;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Visiteur visiteur) {
        visiteurService.saveVisiteur(visiteur);
        Map<String, String> response = new HashMap<>();
        response.put("message", "New Visiteur is Added");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    }




