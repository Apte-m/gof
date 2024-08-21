package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject {
    int temp;
    List<Observer> observers;

    public Weather() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);

    }

    void updateObserver() {
        observers.forEach(Observer::update);
    }

    public void updateInfo() {
        updateObserver();
    }


    public void setInfo(int temp) {
        this.temp = temp;
        updateInfo();

    }

    @Override
    public int getTemp() {
        return temp;
    }
}
