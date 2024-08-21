package org.example;


import org.example.adapter.TurkeyDuck;
import org.example.adapter.WildTurkey;
import org.example.comand.Garage;
import org.example.comand.GarageDoorOpenCommand;
import org.example.comand.LightOffCommand;
import org.example.comand.LightOnCommand;
import org.example.compose.MenuAll;
import org.example.decarator.Beverage;
import org.example.decarator.Espresso;
import org.example.decarator.Mocha;
import org.example.decarator.Soy;
import org.example.fabrica.ChicagoPizzaStore;
import org.example.fabrica.NYPizzaStore;
import org.example.fabrica.Pizza;
import org.example.fabrica.PizzaStore;
import org.example.iterator.BreakFast;
import org.example.iterator.Dinner;
import org.example.iterator.Waitress;
import org.example.observer.CityTemp;
import org.example.observer.ForestTemp;
import org.example.observer.Weather;
import org.example.singlton.MySinglton;
import org.example.strategy.*;
import org.example.template.Coffee;
import org.example.template.Drink;
import org.example.template.Tea;

public class Main {
    public static void main(String[] args) {
        /**
         Strategy
         **/
        Duck model = new MallardDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
        model.performQuack();
        model.setQuackBehavior(new Whistle());
        model.performQuack();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();

        /**
         Observer
         **/

        Weather weather = new Weather();
        ForestTemp forestTemp = new ForestTemp(weather);
        CityTemp cityTemp = new CityTemp(weather);
        weather.setInfo(6);
        weather.deleteObserver(cityTemp);
        weather.setInfo(232);
        weather.deleteObserver(forestTemp);


        /**
         Decorator
         **/

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());

        /**
         Fabrice
         **/

        PizzaStore ny = new NYPizzaStore();
        PizzaStore ch = new ChicagoPizzaStore();
        Pizza pizzaNY = ny.orderPizza("NY");
        Pizza pizzaCH = ch.orderPizza("CH");


        /**
         Singlton
         **/

        MySinglton mySinglton = MySinglton.getInstance();


        /**
         Team
         **/

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand();
        Garage garage = new Garage();
        LightOnCommand lightOnCommand = new LightOnCommand(garage);
        LightOffCommand lightOffCommand = new LightOffCommand(garage);

        garageDoorOpenCommand.setCommand(lightOnCommand);
        garageDoorOpenCommand.buttonWasPress();

        garageDoorOpenCommand.setCommand(lightOffCommand);
        garageDoorOpenCommand.buttonWasPress();

        /**
         Adapter
         **/

        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new TurkeyDuck(wildTurkey));
        duck.setQuackBehavior(new TurkeyDuck(wildTurkey));
        duck.performFly();
        duck.performQuack();

        /**
         Template method
         **/

        Drink drink = new Tea();
        drink.prepare();
        drink = new Coffee();
        drink.prepare();

        /**
         Iterator
         **/

        BreakFast breakFast = new BreakFast();
        Dinner dinner = new Dinner();

        Waitress waitress = new Waitress(breakFast, dinner);
        waitress.printAllMenu();

        /**
         Compose
         **/

        MenuAll menuAll = new MenuAll();
        menuAll.addMenu(dinner);
        menuAll.addMenu(breakFast);
        menuAll.printAllMenu();


    }
}

