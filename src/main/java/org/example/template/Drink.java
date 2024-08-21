package org.example.template;

public abstract class Drink {

    public final void prepare() {
        fillWatter();
        addDrink();
        if (hook()) {
            addSugar();
        }
    }

    private void fillWatter() {
        System.out.println("Налить воды в кружку");
    }

    protected abstract void addDrink();

    protected boolean hook() {
        return false;
    }

    private void addSugar() {
        System.out.println("Добавить сахар");
    }


}
