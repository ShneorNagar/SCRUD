package com.shneor.SCRUD.controller;

import com.shneor.SCRUD.entity.Snake;
import com.shneor.SCRUD.service.SnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private SnakeService snakeService;

    @PostMapping("/snakeMoved")
    public Snake snakeMoved(@RequestBody Snake snake){
        return snakeService.saveSnake(snake);
    }
}