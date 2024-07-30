package com.corejava.variable.interfaces;

public interface Vehicle {
    int NUMBER_OF_DOOR = 4;
    void engine();

    default void gearBox() {
        System.out.println("gear");
        privateMethod();

    }
    static void getCarDetails() {
        System.out.println("Car details");
    }
    private void privateMethod() {
        System.out.println("Private");
    }
}
