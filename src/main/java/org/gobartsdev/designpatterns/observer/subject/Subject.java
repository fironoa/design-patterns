package org.gobartsdev.designpatterns.observer.subject;

import org.gobartsdev.designpatterns.observer.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObserver();

}
