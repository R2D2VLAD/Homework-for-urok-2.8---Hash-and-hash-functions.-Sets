package Автогонки;

import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Car {
    private String brand; // марка
    private String model; // модель
    private double engineVolume; // объём двигателя
    Set<Driver> driversList;
    Set<Mechanic<?>> mechanicsList;
    Set<Sponsor> sponsorList;

    public Car(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.sponsorList = new HashSet<>();
        this.mechanicsList = new HashSet<>();
        this.driversList = new HashSet<>();
    }

    public void addDriver(Driver driver){
        driversList.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanicsList.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor){
        sponsorList.add(sponsor);
    }

    public abstract void startMovement(); // начать движение

    public abstract void endMovement(); // закончить движение

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public void offer(Car car) {
    }
}