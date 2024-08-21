package org.example.strategy;

public class Whistle implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("This whistle 'quack quack' i'm not duck");
    }
}
