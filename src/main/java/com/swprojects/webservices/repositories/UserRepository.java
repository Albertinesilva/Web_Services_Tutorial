package com.swprojects.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swprojects.webservices.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}