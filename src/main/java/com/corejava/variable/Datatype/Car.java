package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private int carId;
    private boolean airBag;
    private String carModel;
    private Engine engine;

    public Car(int id, boolean airBag, String model, int number, int power, String model2) {
        this.carId = id;
        this.airBag = airBag;
        this.carModel = model;
        this.engine = new Engine(number,power,model2);
    }

    public void printCarDetails() {
        log.info("Car Id :"+carId+" Has AirBag :"+airBag+" Car Model :"+carModel);
        engine.printEngineDetails();
    }
}
