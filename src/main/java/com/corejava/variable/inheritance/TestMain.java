package com.corejava.variable.inheritance;

public class TestMain {
    public static void main(String[] args) {
        HighEndCar highEndCar = new HighEndCar(1,2,4);
        highEndCar.getCarDetails();
        highEndCar.getGear("Automatic");
        highEndCar.getHighEnd();
        BaseCar baseCar = new BaseCar(1,2,3);
        baseCar.getCarDetails();
    }
}
