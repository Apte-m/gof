package org.example.fabrica;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "NY" -> pizza = new NYPizza();

            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return pizza;
    }
}
