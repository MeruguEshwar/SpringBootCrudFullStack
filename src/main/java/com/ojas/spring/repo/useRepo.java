package com.ojas.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.model.UserRegistration;

@Repository
public interface useRepo extends JpaRepository<UserRegistration, Integer> {

}
