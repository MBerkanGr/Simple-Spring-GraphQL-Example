package com.mehmetberkan.SpringGraphQLExample.service;

import com.mehmetberkan.SpringGraphQLExample.dto.VehicleDto;
import com.mehmetberkan.SpringGraphQLExample.model.Vehicle;
import com.mehmetberkan.SpringGraphQLExample.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getVehicleList(String type) {
        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    public Vehicle createVehicle(VehicleDto vehicleDto) {
        return vehicleRepository.save(dtoToEntity(vehicleDto));
    }

    private Vehicle dtoToEntity(VehicleDto dto) {
        Vehicle vehicle = new Vehicle();

        vehicle.setBrandName(dto.getBrandName());
        vehicle.setType(dto.getType());
        vehicle.setModelCode(dto.getModelCode());
        vehicle.setLaunchDate(new Date());

        return vehicle;
    }
}
