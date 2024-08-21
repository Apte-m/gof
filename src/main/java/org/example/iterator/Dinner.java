package org.example.iterator;

import java.util.Iterator;

public class Dinner implements Menu {
    private static int MAX_MENU = 6;
    private int numberItem = 0;
    private MenuItem[] menuItems;

    public Dinner() {
        this.menuItems = new MenuItem[MAX_MENU];
        addItem("Fish", "Boiled fish", "1.55");
    }

    public void addItem(String name, String description, String cost) {
        MenuItem item = new MenuItem(name, description, cost);
        if (numberItem >= MAX_MENU) {
            System.out.println("Sorry menu is full");
        } else {
            menuItems[numberItem] = item;
            numberItem = numberItem + 1;
        }

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinnerIterator(menuItems);
    }

    public void printMenu() {
        Iterator<MenuItem> iterator = createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("Dinner " + menuItem.getName() + " description " + menuItem.getDescription() + " cost " + menuItem.getCost());

        }
    }


}
