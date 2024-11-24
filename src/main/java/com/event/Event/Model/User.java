package com.event.Event.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    public Long id;
    public String name;
    public int age;
    public String email;
    public String contactNumber;
    public String password;
}
