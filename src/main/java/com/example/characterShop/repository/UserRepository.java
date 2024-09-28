package com.example.characterShop.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.characterShop.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}