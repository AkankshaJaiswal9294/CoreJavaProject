package com.corejava.variable.Datatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CarEngine {
    public static void main(String[] args) {
        Car car = new Car(1001, true, "HYUNDAI", 1221, 555, "ABCD");
        car.printCarDetails();
    }
}
