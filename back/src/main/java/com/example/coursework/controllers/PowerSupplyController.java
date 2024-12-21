package com.example.coursework.controllers;

import com.example.coursework.components.PowerSupply;
import com.example.coursework.service.PowerSupplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/power-supplies")
@RestController
@RequiredArgsConstructor
public class PowerSupplyController {
    final private PowerSupplyService powerSupplyService;

    @GetMapping
    public ResponseEntity<List<PowerSupply>> getPowerSupply() {
        List<PowerSupply> list = powerSupplyService.getAll();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(list);
    }
}
