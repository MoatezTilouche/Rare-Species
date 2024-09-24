package com.example.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonor;
    private String Fname;
    private String Lname;
    private String city;
    private String pays;
    private String email;
    private boolean donPermonth;
    private boolean donOnly;

    private  float montant;
    private String birthDate;
    public Donor(){

    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdDonor() {
        return idDonor;
    }

    public void setIdDonor(int idDonor) {
        this.idDonor = idDonor;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getCity() {
        return city;
    }

    public String getLname() {
        return Lname;
    }

    public String getPays() {
        return pays;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public boolean isDonOnly() {
        return donOnly;
    }

    public boolean isDonPermonth() {
        return donPermonth;
    }

    public void setDonOnly(boolean donOnly) {
        this.donOnly = donOnly;
    }

    public float getMontant() {
        return montant;
    }

    public void setDonPermonth(boolean donPermonth) {
        this.donPermonth = donPermonth;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
    public String toString() {
        return "Donor{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", city='" + city + '\'' +
                ", pays='" + pays + '\'' +
                ", email='" + email + '\'' +
                ", donPermonth=" + donPermonth +
                ", donOnly=" + donOnly +
                ", montant=" + montant +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
