package com.theironyard.clt.controllers;

import com.theironyard.clt.entities.Car;
import com.theironyard.clt.services.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RestController
public class CarServiceController {

    HashMap<String, Car> images = new HashMap<>();

    public void populateCars (String name, Integer year, String image, Integer miles) {
        Car car = new Car(name, year, image, miles);
        images.put(name, car);
    }

    @Autowired
    CarsRepository cars;



    @RequestMapping("/cars")
    public List<Car> showCars (HttpSession session) {


    }

}
