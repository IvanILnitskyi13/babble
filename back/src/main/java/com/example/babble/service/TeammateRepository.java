package com.example.babble.service;

import com.example.babble.model.Teammate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeammateRepository extends JpaRepository<Teammate, Long> {
}
