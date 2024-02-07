package com.mehmetberkan.SpringGraphQLExample.repository;

import com.mehmetberkan.SpringGraphQLExample.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> getByTypeLike(String type);

}
