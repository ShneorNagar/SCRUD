package com.shneor.SCRUD.repository;

import com.shneor.SCRUD.entity.Snake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnakeRepository extends JpaRepository<Snake, Long> {
}
