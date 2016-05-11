package com.theironyard.clt.services;


import com.theironyard.clt.entities.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ultramar on 5/11/16.
 */
public class CarsRepository {
    private static ArrayList<Car> carBase = new ArrayList<>();
    static {
        //add cars
        carBase.add(new Car("Chevrolet Corvette", 1968, "http://images.classiccars.com/classifieds/101590_757959_1968_Chevrolet_Corvette%2BStingray.jpg"));
        carBase.add(new Car("Packard Super 8", 1940, "http://www.conceptcarz.com/images/Packard/40_Packard_Super8_160_Model_1803_DV-06-Chris_05.jpg"));
        carBase.add(new Car("Pontiac GTO Judge", 1969, "https://automotiveviews.files.wordpress.com/2013/05/autowp-ru_pontiac_gto_the_judge_hardtop_coupe_38.jpg"));
        carBase.add(new Car("Ford Mustang", 1966, "http://www.nevadaclassics.com/app_photos/1966_fastback_ravenblack.jpg"));
        carBase.add(new Car("Chevrolet Chevelle SS", 1972, "http://www.chevellestuff.net/1972/chevelle/gallery/2626.jpg"));
        carBase.add(new Car("Chevrolet Impala", 1960, "https://s-media-cache-ak0.pinimg.com/736x/78/d0/7f/78d07f9654cccd63eb849ea0ed2098c6.jpg"));
        carBase.add(new Car("Dodge Charger R/T", 1973, "http://carswithmuscles.com/wp-content/uploads/2015/12/dodc15.jpg"));
        carBase.add(new Car("Bugatti Cisitalia 202GT", 1947, "http://assets.blog.hemmings.com/wp-content/uploads//2012/02/1947-Cisitalia-1000-700x466.jpg"));
        carBase.add(new Car("Mercedes-Benz 170S", 1950, "http://i.ebayimg.com/images/g/cW4AAOSwwpdW~EQp/s-l1600.jpg"));
        carBase.add(new Car("Chevrolet Bel-Air", 1962, "http://bestcarmag.com/sites/default/files/73604381956-Chevrolet-Bel-Air-blue-white-ma.jpg"));
        carBase.add(new Car("Buick Coupe", 1938, "http://www.seriouswheels.com/pics-1930-1939/1938-Buick-Coupe-black-sa-nf.jpg"));
        carBase.add(new Car("Buick Super", 1942, "https://upload.wikimedia.org/wikipedia/commons/1/18/Buick_56S_Coupe_1940.jpg"));
        carBase.add(new Car("Mercury Cougar", 1967, "https://s-media-cache-ak0.pinimg.com/736x/eb/d9/e3/ebd9e39c1847ad740fac3b44243505a0.jpg"));
        carBase.add(new Car("VW Bus", 1969, "https://www.senioradvisor.com/blog/wp-content/uploads/2014/07/Volkswagen-Transporter-Bus.jpg"));
        carBase.add(new Car("Plymouth Fury", 1960, "http://fiftiesweb.com/wordpress/wp-content/uploads/2015/07/60.plymouth-fury-Q.jpg"));
        carBase.add(new Car("Nash Rambler", 1950, "http://s.hswstatic.com/gif/1953-1955-nash-hudson-rambler-7.jpg"));
        carBase.add(new Car("Studebaker Dictator", 1942, "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/1937_Studebaker_Dictator_(4806308916).jpg/250px-1937_Studebaker_Dictator_(4806308916).jpg"));
        carBase.add(new Car("Porche 911", 1971, "https://s-media-cache-ak0.pinimg.com/736x/06/b2/98/06b298a624efeca71269c2f957d018d9.jpg"));
        carBase.add(new Car("Jeep Wagoneer", 1981, "https://upload.wikimedia.org/wikipedia/commons/7/76/Jeep_Grand_Wagoneer_001.JPG"));
        carBase.add(new Car("Mazda RX-7", 1984, "https://upload.wikimedia.org/wikipedia/commons/8/80/1st_Mazda_RX-7_--_04-11-2012_2.JPG"));
        

    }





    public List<Car> getCars()


}
