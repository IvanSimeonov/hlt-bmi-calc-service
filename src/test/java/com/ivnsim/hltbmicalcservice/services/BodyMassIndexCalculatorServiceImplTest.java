package com.ivnsim.hltbmicalcservice.services;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BodyMassIndexCalculatorServiceImplTest {

    private final EasyRandom generator = new EasyRandom();
    private BodyMassIndexCalculatorService bodyMassIndexCalculatorService;
    private Double height;
    private Double weight;

    @BeforeEach
    public void setUp() {
        bodyMassIndexCalculatorService = new BodyMassIndexCalculatorServiceImpl();
    }

    @Test
    void calculateBodyMassIndex() {
        // Given
        height = generator.nextDouble();
        weight = generator.nextDouble();

        // When
        Double bmiResult = bodyMassIndexCalculatorService.calculateBodyMassIndex(height, weight);

        // Then
        assertNotNull(bmiResult);
    }
}