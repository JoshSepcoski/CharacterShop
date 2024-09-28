package com.example.characterShop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.characterShop.model.Charactere;
import com.example.characterShop.repository.CharacterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CharacterController {

    CharacterRepository characterRepository;

    public CharacterController(CharacterRepository characterRepository) {

        this.characterRepository = characterRepository;
    }

    @GetMapping("/characters/")
    public Iterable<Charactere> getCharacters() {
        return characterRepository.findAll(); 
    }

    @GetMapping("/characters/{id}")
    public Charactere getCharacter(@PathVariable("id") Long id) {
        return characterRepository.findById(id).get();
    }

    @PostMapping("/characters/")
    public HttpStatus addCharacter(@RequestBody Charactere character){
        characterRepository.save(character);

        return HttpStatus.CREATED;
    }

}