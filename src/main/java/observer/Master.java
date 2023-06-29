package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
    }
    /*
    Добавлено свойство vacanciesName в метод и конструктор receiveOffer.
     */
    @Override
    public void receiveOffer(String companyName, double salary, String vacanciesName) {
        if (minSalary <= salary){
            System.out.printf("Рабочий %s (%f) >>> Мне нужна эта вакансия! [%s - %f] Вакансия: (%s)\n",
                    name, minSalary, companyName, salary, vacanciesName);
            minSalary = salary;
        }
        else {
            System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
}
