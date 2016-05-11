package com.theironyard.clt.services;

import com.theironyard.clt.entities.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ultramar on 5/11/16.
 */
public interface CarsRepository extends CrudRepository <Car, Integer> {
}
