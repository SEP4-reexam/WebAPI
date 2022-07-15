package com.WebAPI.SEP4.repository;

import com.WebAPI.SEP4.entities.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

}
