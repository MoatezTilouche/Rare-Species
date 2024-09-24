package com.example.back.service;

import com.example.back.model.Visiteur;

import java.util.List;

public interface VisiteurService {
    public Visiteur saveVisiteur(Visiteur visiteur);
    public List<Visiteur> getAllVisiteurs();
}
