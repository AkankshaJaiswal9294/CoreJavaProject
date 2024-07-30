package com.corejava.variable.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElectricCar implements Vehicle {
    private static final Logger log = LogManager.getLogger(ElectricCar.class);

    @Override
    public void engine() {
        log.info("Electric");
    }
}
