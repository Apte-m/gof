package org.example.iterator;

public class Waitress {
    private BreakFast breakFast;
    private Dinner dinner;

    public Waitress(BreakFast breakFast, Dinner dinner) {
        this.breakFast = breakFast;
        this.dinner = dinner;
    }

    public void printAllMenu(){
        breakFast.printMenu();
        dinner.printMenu();
    }
}
