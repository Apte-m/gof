package org.example.strategy;

public class FlyRockedPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm rocked i'm fly");
    }
}
