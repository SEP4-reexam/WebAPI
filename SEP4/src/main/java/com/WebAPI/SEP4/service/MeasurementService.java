package com.WebAPI.SEP4.service;

import com.WebAPI.SEP4.entities.Measurement;

import java.util.List;

public interface MeasurementService {
    List<Measurement> findAllMeasurements();
    Measurement saveMeasurement(Measurement measurement);
    Measurement updateMeasurement(Measurement measurement);
}
