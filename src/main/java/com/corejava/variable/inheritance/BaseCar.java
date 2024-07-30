package com.corejava.variable.inheritance;

import lombok.extern.log4j.Log4j2;

import java.sql.SQLOutput;

@Log4j2
public class BaseCar {
    int numberOfDoors;
    int features;
    int numberOfWheels;

    public BaseCar(int numberOfDoors, int features, int numberOfWheels) {
        this.numberOfDoors = numberOfDoors;
        this.features = features;
        this.numberOfWheels = numberOfWheels;
    }

    public void getCarDetails() {
        log.info("Base Car");
    }

    public void getGear() {
        log.info(" Base Gear");
    }

    public void getGear(String type) {
        log.info("Gear:{}",type);
    }

    public  void getFeatures() {
        log.info("Features");
    }
}
