package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car(int cylinders, String name) {
        setCylinders(cylinders);
        setName(name);
    }

    @Override
    public String toString() {
        return getName() + " " + getCylinders() + " " + getWheels();
    }

    @Override
    public boolean equals(Object obj) {
        return ((Car)obj).getName().equals(this.getName()) && ((Car)obj).getCylinders() == this.getCylinders();
    }

    public String startEngine() {
        return "Engine " + getCylinders() + " " + getName();
    }
    public String accelerate(){
        return "the " + getClass().getSimpleName() + " is accelerating";
    }
    public String brake(){
        return "Brake " + getCylinders() + " " + getName();
    }

}

