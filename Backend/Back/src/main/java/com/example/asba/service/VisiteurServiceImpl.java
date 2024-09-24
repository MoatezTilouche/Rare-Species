package com.example.back.service;

import com.example.back.model.Visiteur;
import com.example.back.repository.VisiteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisiteurServiceImpl implements VisiteurService {

    @Autowired
    private VisiteurRepository visiteurRepository;

    @Override
    public Visiteur saveVisiteur(Visiteur visiteur) {
        return visiteurRepository.save(visiteur);
    }

    @Override
    public List<Visiteur> getAllVisiteurs() {
        return visiteurRepository.findAll();
    }

}
