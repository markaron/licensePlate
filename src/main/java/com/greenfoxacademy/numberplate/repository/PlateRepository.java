package com.greenfoxacademy.numberplate.repository;

import com.greenfoxacademy.numberplate.model.LicencePlates;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlateRepository extends CrudRepository<LicencePlates, String> {

  @Query("select c from LicencePlates c where c.plate like %:search%")
  List<LicencePlates> findAllByPlate(@Param("search") String searchInput);
}
