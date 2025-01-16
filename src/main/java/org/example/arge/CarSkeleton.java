package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void startEngine() {

    }
    public void drive(){

    }

    protected void runEngine() {

    }
}
