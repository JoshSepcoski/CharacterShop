package com.example.characterShop.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.characterShop.model.Charactere;

public interface CharacterRepository extends CrudRepository<Charactere, Long> {
}