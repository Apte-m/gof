package org.example.fabrica;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> topping = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare pizza " + getName());
    }

    public void cut() {
        System.out.println("Cut pizza " + getName());
    }

    public void box() {
        System.out.println("boxing pizza " + getName());
    }

    public String getName() {
        return name;
    }

}
