package org.example.observer;

public interface Subject {
    void registerObserver(Observer o);

    void deleteObserver(Observer o);

    int getTemp();
}
