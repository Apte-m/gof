package org.example.adapter;


import org.example.strategy.FlyBehavior;
import org.example.strategy.QuackBehavior;

public class TurkeyDuck  implements QuackBehavior, FlyBehavior {
    Turkey turkey;


    public TurkeyDuck(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void fly() {
        turkey.fly();

    }

    @Override
    public void quack() {
        turkey.gobble();

    }
}
