package com.greenfoxacademy.numberplate.repository;

import com.greenfoxacademy.numberplate.model.LicensePlates;
import org.springframework.data.repository.CrudRepository;

public interface PlateRepository extends CrudRepository<LicensePlates, String> {
}
