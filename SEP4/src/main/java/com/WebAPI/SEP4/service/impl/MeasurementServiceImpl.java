package com.WebAPI.SEP4.service.impl;

import com.WebAPI.SEP4.entities.Measurement;
import com.WebAPI.SEP4.repository.MeasurementRepository;
import com.WebAPI.SEP4.service.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementServiceImpl implements MeasurementService {
@Autowired
    private final MeasurementRepository measurementRepository;

    public MeasurementServiceImpl(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Override
    public List<Measurement> findAllMeasurements() {
        return measurementRepository.findAll();
    }

    @Override
    public Measurement saveMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }

    @Override
    public Measurement updateMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }
}
