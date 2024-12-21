package com.example.coursework.controllers;

import com.example.coursework.components.GraphicsCards;
import com.example.coursework.service.GraphicsCardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/graphics-сards")
@RestController
@RequiredArgsConstructor
public class GraphicsCardController {
    final private GraphicsCardsService graphicsCardsService;

    @GetMapping
    public ResponseEntity<List<GraphicsCards>> getGraphicsCards() {
        List<GraphicsCards> list = graphicsCardsService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }
}
