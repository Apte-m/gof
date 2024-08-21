package org.example.decarator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost() +  0.22;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha ";
    }
}
