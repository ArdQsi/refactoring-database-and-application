package com.example.coursework.controllers;

import com.example.coursework.components.ComputerCases;
import com.example.coursework.dto.ComputerCasesFilterDto;
import com.example.coursework.service.ComputerCasesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/computer-cases")
@RequiredArgsConstructor
public class ComputerCaseController {
    final private ComputerCasesService computerCasesService;

    @GetMapping
    public ResponseEntity<List<ComputerCases>> getComputerCases() {
        List<ComputerCases> list = computerCasesService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<List<ComputerCases>> setFilterComputerCases(@Valid @RequestBody ComputerCasesFilterDto computerCasesFilterDto) {
        List<ComputerCases> list = computerCasesService.setFilter(computerCasesFilterDto);
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(list);
    }
}
