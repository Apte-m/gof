package org.example.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinnerIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items in the menu");
        }
        MenuItem item = menuItems[position];
        position++;
        return item;
    }

}
