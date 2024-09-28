package com.example.characterShop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "charactere")
public class Charactere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String charClass;


    public Charactere() {

    }

    public Charactere(Long id, String name, String charClass) {
        this.id = id;
        this.name = name;
        this.charClass = charClass;
    }

    public String getname() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getcharClass(){
        return charClass;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setCharClass(String charClass){
        this.charClass = charClass;
    }
    public void setId(long id){
        this.id = id;
    }
}