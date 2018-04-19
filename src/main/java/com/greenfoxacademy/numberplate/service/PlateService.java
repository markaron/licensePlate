package com.greenfoxacademy.numberplate.service;

import com.greenfoxacademy.numberplate.model.LicencePlates;
import com.greenfoxacademy.numberplate.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlateService {

  @Autowired
  PlateRepository plateRepository;

  public List<LicencePlates> findAllPlates(){
    List<LicencePlates> plates = new ArrayList<>();
    plateRepository.findAll().forEach(plates::add);
    return plates;
  }

  public List<LicencePlates> findAllBySearch(String searchString){
    return plateRepository.findAllByPlate(searchString);
  }
}
