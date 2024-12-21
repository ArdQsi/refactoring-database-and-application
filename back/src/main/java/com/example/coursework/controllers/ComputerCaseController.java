package com.example.coursework.controllers;

import com.example.coursework.components.ComputerCases;
import com.example.coursework.dto.ComputerCasesFilterDto;
import com.example.coursework.service.ComputerCasesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/computer-cases")
@RequiredArgsConstructor
public class ComputerCaseController {
    final private ComputerCasesService computerCasesService;

    @GetMapping
    public List<ComputerCases> getComputerCases() {
        List<ComputerCases> list = computerCasesService.getAll();
        return list;
    }

    @PostMapping
    public List<ComputerCases> setFilterComputerCases(@RequestBody ComputerCasesFilterDto computerCasesFilterDto) {
        List<ComputerCases> list = computerCasesService.setFilter(computerCasesFilterDto);
        return list;
    }
}
