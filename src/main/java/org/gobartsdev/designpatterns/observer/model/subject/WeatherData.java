package org.gobartsdev.designpatterns.observer.model.subject;

import org.gobartsdev.designpatterns.observer.model.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observerList;
    float humidity;
    float temperature;

    public WeatherData(){
        this.observerList = new ArrayList<>();
    }

    public float getHumidity() {
        return humidity;
    }


    public float getTemperature() {
        return temperature;
    }


    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }

    public void setMetrics(float humidity, float temperature){
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("measurement changed notifying observers");
        notifyObserver();
    }


}
