package com.WebAPI.SEP4.controller;

import com.WebAPI.SEP4.entities.Measurement;
import com.WebAPI.SEP4.service.MeasurementService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Sauna/measurement")
public class MeasurementController {

    private final MeasurementService measurementService;

    public MeasurementController(MeasurementService measurementService) {
        this.measurementService = measurementService;
    }
    @GetMapping
    public List<Measurement> findAllMeasurements(){
        return measurementService.findAllMeasurements();
    }
    @PostMapping
    public Measurement saveMeasurement(@RequestBody Measurement measurement){
        return measurementService.saveMeasurement(measurement);
    }
    @PutMapping
    public Measurement updateMeasurement(@RequestBody Measurement measurement){
        return measurementService.updateMeasurement(measurement);
    }
}