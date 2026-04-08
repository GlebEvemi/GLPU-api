package com.skillissue.GLPUinventory.Entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String id;

    private String username;

    private String pass;

    private String role;
    

    public User(String username, String pass, String role) {
        this(UUID.randomUUID().toString(), username, pass, role);
    }


    public User(String id, String username, String pass, String role) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.role = role;
    }    

    
    
}
