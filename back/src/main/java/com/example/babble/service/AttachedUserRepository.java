package com.example.babble.service;

import com.example.babble.model.AttachedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachedUserRepository extends JpaRepository<AttachedUser, Long>  {
}
