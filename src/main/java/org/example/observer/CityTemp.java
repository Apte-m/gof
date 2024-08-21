package org.example.observer;

public class CityTemp implements Observer, Display {
    private int temp;
    Weather weather;

    public CityTemp(Weather weather) {
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
        System.out.println("CityTemp " + weather.getTemp());
    }
}
