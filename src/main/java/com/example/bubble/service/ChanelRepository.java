package com.example.bubble.service;

import com.example.bubble.domain.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChanelRepository extends JpaRepository<Channel, Long> {
}
