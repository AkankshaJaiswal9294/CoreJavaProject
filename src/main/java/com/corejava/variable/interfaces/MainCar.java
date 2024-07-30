package com.corejava.variable.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainCar {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.engine();
        petrolCar.gearBox();
        log.info(Vehicle.NUMBER_OF_DOOR);

        Vehicle electricCar = new ElectricCar();
        electricCar.engine();
        electricCar.gearBox();
        Vehicle.getCarDetails();
    }
}
