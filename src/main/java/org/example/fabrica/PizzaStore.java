package org.example.fabrica;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza1 = createPizza(type);
        pizza1.prepare();
        pizza1.cut();
        pizza1.box();
        return pizza1;
    }

    ;
}
