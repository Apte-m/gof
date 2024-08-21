package org.example.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Я утка турецкая , не крякаю и шиплю");
    }

    @Override
    public void fly() {
        System.out.println("Я утка турецкая , не летаю далеко");
    }
}
