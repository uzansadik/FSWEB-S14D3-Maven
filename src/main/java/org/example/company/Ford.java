package org.example.company;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
        super.setEngine(true);
        super.setWheels(4);
    }
}
