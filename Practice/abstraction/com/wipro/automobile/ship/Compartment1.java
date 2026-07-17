// Create a class called compartment which represents the ship compartments with attributes like height, width and breadth. 
// Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
// To avoid conflict create this class in a new package called com.wipro.automobile.ship

package com.wipro.automobile.ship;

public class Compartment1 {
    private double height;
    private double width;
    private double breadth;

    public Compartment1(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Ship Compartment [Height = " + height + ", Width = " + width + ", Breadth = " + breadth + "]";
    }
}