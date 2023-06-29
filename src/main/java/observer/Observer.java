package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

public interface Observer {

    /*
    Добавлено свойство vacanciesName в наблюдатель.
     */
    void receiveOffer(String companyName, double salary, String vacanciesName);

}
