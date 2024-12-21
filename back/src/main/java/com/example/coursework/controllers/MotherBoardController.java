package com.example.coursework.controllers;

import com.example.coursework.components.MotherBoards;
import com.example.coursework.service.MotherBoardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/mother-boards")
@RestController
@RequiredArgsConstructor
public class MotherBoardController {
    final private MotherBoardsService motherBoardsService;

    @GetMapping
    public List<MotherBoards> getMotherBoards() {
        List<MotherBoards> list = motherBoardsService.getAll();
        return list;
    }
}
