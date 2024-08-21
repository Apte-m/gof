package org.example.compose;

import org.example.iterator.Menu;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

public class MenuAll {
    private List<Menu> menu;

    public MenuAll() {
        this.menu = new ArrayList<>();
    }

    public void addMenu(Menu menu) {
        this.menu.add(menu);

    }

    public void printAllMenu() {
        menu.forEach(Menu::printMenu);
    }


}
