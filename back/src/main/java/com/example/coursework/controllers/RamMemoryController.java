package com.example.coursework.controllers;

import com.example.coursework.components.*;
import com.example.coursework.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ram-memories")
@RestController
@RequiredArgsConstructor
public class RamMemoryController {
    final private RamMemoryService ramMemoryService;

    @GetMapping
    public ResponseEntity<List<RamMemory>> getRamMemory() {
        List<RamMemory> list = ramMemoryService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }
}
