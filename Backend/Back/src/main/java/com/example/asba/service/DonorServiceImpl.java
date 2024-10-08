package com.example.back.service;

import com.example.back.model.Donor;
import com.example.back.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DonorServiceImpl implements DonorService{
    @Autowired
    private DonorRepository donorRepository;
    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor) ;
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }
}
