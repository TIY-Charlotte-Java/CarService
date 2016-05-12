package com.theironyard.clt.controllers;

import com.theironyard.clt.entities.Car;
import com.theironyard.clt.services.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CarServiceController {

    @Autowired
    CarsRepository cars;



    @RequestMapping("/cars")
    public List<Car> showCars (HttpSession session) {
        List<Car> Cars = cars.getCars();

        return Cars;
    }

}
