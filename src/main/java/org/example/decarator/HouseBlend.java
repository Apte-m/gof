package org.example.decarator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend ";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
