package org.gobartsdev.designpatterns.observer.model.subject;

import org.gobartsdev.designpatterns.observer.model.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObserver();

}
