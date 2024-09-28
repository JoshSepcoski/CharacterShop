package com.example.characterShop.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character")
public class Backstory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String tag;

    public Backstory() {

    }

    public Backstory(Long id, String description, String tag) {
        this.id = id;
        this.description = description;
        this.tag = tag;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTag(){
        return tag;
    }

    public void setId(long id){
        this.id = id;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public void setCharClass(String tag){
        this.tag = tag;
    }
}