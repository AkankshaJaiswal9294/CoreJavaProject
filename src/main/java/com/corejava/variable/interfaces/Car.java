package com.corejava.variable.interfaces;

public abstract class Car {
    public int noOfDoors;

    public Car(int door){

        this.noOfDoors = door;
    }

    public abstract void engine();

    public void gearBox(){

        System.out.println("Manual Gear box");
    }
}
