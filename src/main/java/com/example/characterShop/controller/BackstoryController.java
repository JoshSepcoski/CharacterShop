package com.example.characterShop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.characterShop.model.Backstory;
import com.example.characterShop.repository.BackstoryRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BackstoryController {

    BackstoryRepository backstoryRepository;

    public BackstoryController(BackstoryRepository backstoryRepository) {

        this.backstoryRepository = backstoryRepository;
    }

    @GetMapping("/backstories/")
    public Iterable<Backstory> getBackstories() {
        return backstoryRepository.findAll(); 
    }

    @GetMapping("/backstories/{id}")
    public Backstory getBackstory(@PathVariable("id") Long id) {
        return backstoryRepository.findById(id).get();
    }

    @PostMapping("/backstories/")
    public HttpStatus addBackstory(@RequestBody Backstory backstory){
        backstoryRepository.save(backstory);

        return HttpStatus.CREATED;
    }

}