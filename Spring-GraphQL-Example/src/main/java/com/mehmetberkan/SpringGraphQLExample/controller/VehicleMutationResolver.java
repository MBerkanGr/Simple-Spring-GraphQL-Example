package com.mehmetberkan.SpringGraphQLExample.controller;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mehmetberkan.SpringGraphQLExample.dto.VehicleDto;
import com.mehmetberkan.SpringGraphQLExample.model.Vehicle;
import com.mehmetberkan.SpringGraphQLExample.service.VehicleService;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutationResolver implements GraphQLMutationResolver {

    private final VehicleService service;

    public VehicleMutationResolver(VehicleService service) {
        this.service = service;
    }

    public Vehicle createVehicle(VehicleDto vehicle) {
        return service.createVehicle(vehicle);
    }
}
