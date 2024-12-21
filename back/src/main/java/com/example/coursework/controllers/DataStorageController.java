package com.example.coursework.controllers;

import com.example.coursework.components.DataStorage;
import com.example.coursework.service.DataStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/data-storages")
@RestController
@RequiredArgsConstructor
public class DataStorageController {
    final private DataStorageService dataStorageService;

    @GetMapping
    public List<DataStorage> getDataStorage() {
        List<DataStorage> list = dataStorageService.getAll();
        return list;
    }
}
