package com.theironyard.clt.entities;

import javax.persistence.Entity;

@Entity
public class Car {
    String title;
    Integer year;
    String image;
    Integer miles;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }

    public Car() {
    }

    public Car(String title, Integer year, String image, Integer miles) {
        this.title = title;
        this.year = year;
        this.image = image;
        this.miles = miles;
    }
}
