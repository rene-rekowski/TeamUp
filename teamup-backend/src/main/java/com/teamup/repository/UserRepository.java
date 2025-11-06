package com.teamup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamup.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
