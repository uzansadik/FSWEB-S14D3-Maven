package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
        super.setEngine(true);
        super.setWheels(4);    }
}
