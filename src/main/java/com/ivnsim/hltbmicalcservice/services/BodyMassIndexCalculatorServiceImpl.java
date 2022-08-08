package com.ivnsim.hltbmicalcservice.services;

import org.springframework.stereotype.Service;

@Service
public class BodyMassIndexCalculatorServiceImpl implements BodyMassIndexCalculatorService {
    @Override
    public Double calculateBodyMassIndex(Double height, Double weight) {
        return (double) Math.round((weight / Math.pow((height / 100), 2)) * 100) / 100;
    }
}