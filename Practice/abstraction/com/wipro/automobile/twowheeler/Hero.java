// Create twowheeler subpackage under automobile package
// Hero class extends automobile.vehicle class with the following methods
// public int getSpeed() – returns the current speed of the vehicle.
// public void radio() – provides facility to control the radio device

package com.wipro.automobile.twowheeler;

import com.wipro.automobile.Vehicle;

public class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Controlling the Hero FM Radio player...");
    }
}