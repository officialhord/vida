package com.vida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @RequestMapping("/vehicle/{id}")
    public Vehicle getVehicle(@PathVariable long id) {
        return vehicleService.getVehicle(id);
    }

    @RequestMapping("/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/vehicle")
    public void addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
    }


}
