package com.example.coursework.controllers;

import com.example.coursework.components.Processors;
import com.example.coursework.dto.ManufacturerRequestDto;
import com.example.coursework.service.ProcessorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/processors")
@RestController
@RequiredArgsConstructor
public class ProcessorController {
    final private ProcessorsService processorsService;

    @GetMapping
    public List<Processors> getProcessors() {
        List<Processors> list = processorsService.getAll();
        return list;
    }

    @PostMapping
    public List<Processors> getProcessorsByManufacturer(@RequestBody ManufacturerRequestDto manufacturer) {
        List<Processors> list = processorsService.getByManufacturer(manufacturer.getManufacturer());
        return list;
    }
}
