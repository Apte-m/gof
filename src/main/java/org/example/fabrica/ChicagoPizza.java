package org.example.fabrica;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza() {
        name = "Chicago Pizza";
        dough = "Crust Dough";
        sauce = "Marinara Source";

        topping.add("Grated Reggiano Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting for Chicago");;
    }
}
