package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
        super.setEngine(true);
        super.setWheels(4);
    }
}
