package com.vida;

import com.vida.errorHandling.ValidityCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    ValidityCheck validityCheck;


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
   Boolean validateDate = validityCheck.validateDate(""+vehicle.getModelYear());
            if(validateDate=true){
                vehicleService.addVehicle(vehicle);
            }

    }


}
