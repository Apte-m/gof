package org.example.fabrica;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "CH" -> pizza = new ChicagoPizza();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return pizza;
    }
}
