package com.example.coursework.controllers;

import com.example.coursework.components.Processors;
import com.example.coursework.dto.ManufacturerRequestDto;
import com.example.coursework.service.ProcessorsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/processors")
@RestController
@RequiredArgsConstructor
public class ProcessorController {
    final private ProcessorsService processorsService;

    @GetMapping
    public ResponseEntity<List<Processors>> getProcessors() {
        List<Processors> list = processorsService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<List<Processors>> getProcessorsByManufacturer(@Valid @RequestBody ManufacturerRequestDto manufacturer) {
        List<Processors> list = processorsService.getByManufacturer(manufacturer.getManufacturer());
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(list);
    }
}
