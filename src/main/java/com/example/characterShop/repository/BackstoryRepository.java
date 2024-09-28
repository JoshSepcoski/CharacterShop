package com.example.characterShop.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.characterShop.model.Backstory;

public interface BackstoryRepository extends CrudRepository<Backstory, Long> {
}