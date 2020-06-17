package com.shneor.SCRUD.service;

import com.shneor.SCRUD.entity.Snake;
import com.shneor.SCRUD.repository.SnakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SnakeService {

    @Autowired
    private SnakeRepository snakeRepository;

    public Snake saveSnake(Snake snake){
        return snakeRepository.save(snake);
    }
}
