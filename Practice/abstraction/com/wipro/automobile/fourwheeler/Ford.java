// Ford class extends com.automobile.Vehicle class
// public int speed() – Returns the current speed of the vehicle.
// public int tempControl() – provides facility to control the air conditioning device which is available in the car

package com.wipro.automobile.fourwheeler;

import com.wipro.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
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

    public int tempControl() {
        System.out.println("Air conditioning temperature adjusted to 22°C...");
        return 1; // Returns status (e.g., 1 for active)
    }
}