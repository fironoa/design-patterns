package com.gobartsdev.designpatterns.observer.subject;

import com.gobartsdev.designpatterns.observer.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObserver();

}
