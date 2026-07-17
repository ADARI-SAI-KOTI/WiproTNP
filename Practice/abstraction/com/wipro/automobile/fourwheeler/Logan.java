// Create FourWheeler subpackage under automobile package
// Logan class extends com.automobile.Vehicle class
// public int speed() – Returns the current speed of the vehicle.
// public int gps() – provides facility to control the gps device 

package com.wipro.automobile.fourwheeler;

import com.wipro.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
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

    public int speed() {
        return speed;
    }

    public int gps() {
        System.out.println("GPS Tracking is active...");
        return 1; // Returns status (e.g., 1 for active)
    }
}