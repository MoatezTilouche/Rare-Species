package com.example.back.service;

import com.example.back.model.Donor;

import java.util.List;

public interface DonorService {
    public Donor saveDonor(Donor donor);
    public List<Donor> getAllDonors();
}
