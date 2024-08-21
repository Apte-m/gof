package org.example.observer;

public class ForestTemp implements Observer, Display {
    private int temp;
    Weather weather;

    public ForestTemp(Weather weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void update() {
        temp = weather.getTemp();
        display();

    }
    @Override
    public void display() {
        System.out.println("ForestTemp " + weather.getTemp());
    }
}
