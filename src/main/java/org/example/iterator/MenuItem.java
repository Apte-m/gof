package org.example.iterator;

public class MenuItem {


    private String name;
    private String cost;
    private String description;

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem(String name, String description, String cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

}
