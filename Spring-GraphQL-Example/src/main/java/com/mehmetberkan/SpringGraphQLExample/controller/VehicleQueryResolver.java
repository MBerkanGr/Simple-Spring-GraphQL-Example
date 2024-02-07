package com.mehmetberkan.SpringGraphQLExample.controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mehmetberkan.SpringGraphQLExample.model.Vehicle;
import com.mehmetberkan.SpringGraphQLExample.service.VehicleService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final VehicleService service;

    public VehicleQueryResolver(VehicleService service) {
        this.service = service;
    }

    public List<Vehicle> getVehicleList(String type) {
        return service.getVehicleList(type);
    }

    public Optional<Vehicle> getById(Long id) {
        return service.getVehicleById(id);
    }
}
