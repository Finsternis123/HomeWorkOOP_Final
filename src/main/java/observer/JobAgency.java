package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, double salary, String vacanciesName) {
        for (Observer observer: observers) {
            observer.receiveOffer(companyName, salary, vacanciesName);
        }
    }
}