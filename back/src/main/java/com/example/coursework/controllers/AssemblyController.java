package com.example.coursework.controllers;

import com.example.coursework.components.*;
import com.example.coursework.database.PCAssembly;
import com.example.coursework.dto.ComponentsIdDto;
import com.example.coursework.service.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/assemblies")
@RestController
@RequiredArgsConstructor
public class AssemblyController {
    final private ComputerCasesService computerCasesService;
    final private DataStorageService dataStorageService;
    final private GraphicsCardsService graphicsCardsService;
    final private MotherBoardsService motherBoardsService;
    final private PowerSupplyService powerSupplyService;
    final private ProcessorsService processorsService;
    final private RamMemoryService ramMemoryService;

    @PostMapping
    public ResponseEntity<PCAssembly> getAssembly(@Valid @RequestBody ComponentsIdDto componentsId) {
        ComputerCases computerCases = computerCasesService.getById(componentsId.getComputercasesid());
        DataStorage dataStorage = dataStorageService.getById(componentsId.getDatastorageid());
        MotherBoards motherBoards = motherBoardsService.getById(componentsId.getMotherboardsid());
        PowerSupply powerSupply = powerSupplyService.getById(componentsId.getPowersupplyid());
        Processors processors = processorsService.getById(componentsId.getProcessorsid());
        RamMemory ramMemory = ramMemoryService.getById(componentsId.getRam_memoryid());
        GraphicsCards graphicsCards = graphicsCardsService.getById(componentsId.getGraphicscardsid());

        if(computerCases==null || dataStorage==null || motherBoards==null || powerSupply==null ||
                processors==null || ramMemory==null || graphicsCards==null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        PCAssembly pcAssembly = new PCAssembly(computerCases, dataStorage, graphicsCards, motherBoards,
                powerSupply, processors, ramMemory);
        return ResponseEntity.ok(pcAssembly);
    }
}
