package com.example.characterShop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;

    public User() {

    }

    public User(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getuserName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public void setId(long id){
        this.id = id;
    }
    
    public void setuserName(String userName){
        this.userName = userName;
    }

    public void setCharClass(String password){
        this.password = password;
    }
}