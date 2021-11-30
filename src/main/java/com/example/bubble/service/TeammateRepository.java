package com.example.bubble.service;

import com.example.bubble.domain.Teammate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeammateRepository extends JpaRepository<Teammate, Long> {
}
