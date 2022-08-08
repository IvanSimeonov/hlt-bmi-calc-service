package com.ivnsim.hltbmicalcservice.controllers;

import com.ivnsim.hltbmicalcservice.services.BodyMassIndexCalculatorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bmi-calc")
public class BodyMassIndexCalculatorController {

    private final BodyMassIndexCalculatorService bodyMassIndexCalculatorService;

    public BodyMassIndexCalculatorController(BodyMassIndexCalculatorService bodyMassIndexCalculatorService) {
        this.bodyMassIndexCalculatorService = bodyMassIndexCalculatorService;
    }

    @Operation(summary = "Calculate Body Mass Index")
    @GetMapping
    public Double getCalculatedBodyMassIndex(@RequestParam(name = "height") Double height, @RequestParam(name = "weight") Double weight) {
        return this.bodyMassIndexCalculatorService.calculateBodyMassIndex(height, weight);
    }


}
