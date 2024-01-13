package org.gobartsdev.designpatterns.observer.model.observer;

import org.gobartsdev.designpatterns.observer.model.subject.WeatherData;

public class TemperatureScreen implements Observer, Display{

    private final WeatherData weatherData;

    public TemperatureScreen(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Im displaying the Temperature : " + weatherData.getTemperature());
    }

    @Override
    public void update() {
        this.display();
    }
}