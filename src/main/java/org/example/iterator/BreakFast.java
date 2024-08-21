package org.example.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BreakFast implements Menu {

    private List<MenuItem> menuItems;

    public BreakFast() {
        this.menuItems = new ArrayList<>();
        addItem("Eggs", "Scrambled eggs", "1.99");
        addItem("Pancakes", "Home pancakes", "0.99");
    }

    public void addItem(String name, String description, String cost) {
        menuItems.add(new MenuItem(name, cost, description));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinnerIterator(menuItems.toArray(MenuItem[]::new));
    }

    public void printMenu() {
        Iterator<MenuItem> iterator = createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(
                    "BreakFast "
                            + menuItem.getName()
                            + " description "
                            + menuItem.getDescription()
                            + " cost "
                            + menuItem.getCost()
            );
        }
    }


}
