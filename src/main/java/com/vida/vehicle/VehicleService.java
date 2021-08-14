package com.vida.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public Vehicle getVehicle(Long id) {

        Vehicle vehicle = new Vehicle();

          return null;
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicleRepo.findAll().forEach(vehicles::add);

        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleRepo.save(vehicle);
    }
}
