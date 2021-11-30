package com.example.bubble.service;

import com.example.bubble.domain.AttachedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachedUserRepository extends JpaRepository<AttachedUser, Long>  {
}
