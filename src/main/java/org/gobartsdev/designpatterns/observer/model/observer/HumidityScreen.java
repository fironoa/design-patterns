package org.gobartsdev.designpatterns.observer.model.observer;

import org.gobartsdev.designpatterns.observer.model.subject.WeatherData;

public class HumidityScreen implements Observer, Display{

    private WeatherData weatherData;

    public HumidityScreen(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Im displaying the Humidity : " + weatherData.getHumidity());
    }

    @Override
    public void update() {
        this.display();
    }
}
