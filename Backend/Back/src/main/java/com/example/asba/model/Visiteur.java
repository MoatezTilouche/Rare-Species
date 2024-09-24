package com.example.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class Visiteur  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vis;
    private String name;
    private String mail;

    private String message;

    public Visiteur(){

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public int getId_vis() {
        return id_vis;
    }

    public String getMail() {
        return mail;
    }

    public void setId_vis(int id_vis) {
        this.id_vis = id_vis;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
