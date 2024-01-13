package org.gobartsdev;

import org.gobartsdev.designpatterns.observer.model.observer.HumidityScreen;
import org.gobartsdev.designpatterns.observer.model.observer.TemperatureScreen;
import org.gobartsdev.designpatterns.observer.model.subject.WeatherData;
import org.gobartsdev.designpatterns.strategy.model.Character;
import org.gobartsdev.designpatterns.strategy.model.King;
import org.gobartsdev.designpatterns.strategy.model.Queen;
import org.gobartsdev.designpatterns.strategy.services.BowAndArrowBehavior;
import org.gobartsdev.designpatterns.strategy.services.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running strategy pattern");
        System.out.println("************************");
        runStrategyPattern();


        System.out.println("\nRunning observer pattern");
        System.out.println("************************");
        runObserverPattern();
    }

    public static void runStrategyPattern(){
        Character ned = new King();
        ned.setWeaponBehaviour(new SwordBehavior());
        ned.fight();


        Character sansa = new Queen();
        sansa.setWeaponBehaviour(new BowAndArrowBehavior());
        sansa.fight();
    }

    public static void runObserverPattern(){

        WeatherData weatherData = new WeatherData();
        System.out.println("Adding one observer to capture the humidity");
        weatherData.addObserver(new HumidityScreen(weatherData));
        weatherData.setMetrics(13.2F, 34.5F);

        System.out.println("\nAdding another observer to capture the temperature and setting new Metrics to weather data");
        weatherData.addObserver(new TemperatureScreen(weatherData));
        weatherData.setMetrics(13.2F, 34.5F);
    }
}

