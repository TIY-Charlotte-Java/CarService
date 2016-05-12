package com.theironyard.clt.controllers;

import com.theironyard.clt.entities.Car;
import com.theironyard.clt.services.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@RestController
public class CarServiceController {

    @Autowired
    CarsRepository cars;



    @RequestMapping("/cars")
    public List<Car> showCars (HttpSession session, HttpServletResponse response)throws IOException {
        List<Car> Cars = cars.getCars();

        response.sendRedirect("/");
        return Cars;
    }

}
