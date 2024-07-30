package com.corejava.variable.inheritance;

public class HighEndCar extends BaseCar {
    public HighEndCar(int numberOfDoors, int features, int numberOfWheels) {
        super(numberOfDoors, features, numberOfWheels);
    }

    @Override
    public void getCarDetails() {
            System.out.println("High end");
        }

    public void getHighEnd() {
        getGear();
        getFeatures();
    }

}
