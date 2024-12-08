package com.event.Event.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    public Long id;
    public String name;
    public int age;
    @Column(unique = true, nullable = false)
    private String email;
    public String contactNumber;
    public String password;

    @Column(name = "is_admin", nullable = false)
    private boolean isAdmin = false; // Default value


    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
