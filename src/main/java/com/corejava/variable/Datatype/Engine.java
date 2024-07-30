package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {
    private int engineNumber;
    private int enginePower;
    private String engineModel;

    public Engine(int number, int power, String model) {
        this.engineNumber = number;
        this.enginePower = power;
        this.engineModel = model;
    }

    public void printEngineDetails() {
        log.info("Engine Num :"+engineNumber+" Engine Power :"+enginePower+" Engine Model :"+engineModel);
    }
}
