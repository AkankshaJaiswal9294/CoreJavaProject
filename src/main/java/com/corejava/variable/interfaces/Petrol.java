package com.corejava.variable.interfaces;

    public class Petrol extends Car{
        public Petrol(int door) {
            super(door);
        }

        @Override
        public void engine() {
            System.out.println("Petrol Engine");
        }


    }

