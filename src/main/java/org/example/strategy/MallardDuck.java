package org.example.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
