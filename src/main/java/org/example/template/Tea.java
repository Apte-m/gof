package org.example.template;

public class Tea extends Drink {
    @Override
    public void addDrink() {
        System.out.println("Добавить чай в воду");
    }

    public boolean hook() {
        return true;
    }
}
