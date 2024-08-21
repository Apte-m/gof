package org.example.fabrica;

public class NYPizza extends Pizza {
    public NYPizza() {
        name = "NY Pizza";
        dough = "Crust Dough";
        sauce = "Marinara Source";

        topping.add("Grated Reggiano Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting for NYPizza");

    }
}
