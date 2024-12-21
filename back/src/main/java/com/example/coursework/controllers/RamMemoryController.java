package com.example.coursework.controllers;

import com.example.coursework.components.*;
import com.example.coursework.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ram-memories")
@RestController
@RequiredArgsConstructor
public class RamMemoryController {
    final private RamMemoryService ramMemoryService;

    @GetMapping
    public List<RamMemory> getRamMemory() {
        List<RamMemory> list = ramMemoryService.getAll();
        return list;
    }
}
