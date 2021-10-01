package com.serasa.trial.repository;

import java.util.List;

import com.serasa.trial.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

}
