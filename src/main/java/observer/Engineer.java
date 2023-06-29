package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

import java.util.Random;
/*
Добавлен новый тип соискателя Инженер.
 */
public class Engineer implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Engineer(String name) {
        this.name = name;
        minSalary = random.nextDouble(20000, 40000);
    }
    /*
    Добавлено свойство vacanciesName в метод и конструктор receiveOffer.
     */
    @Override
    public void receiveOffer(String companyName, double salary, String vacanciesName) {
        if (minSalary <= salary){
            System.out.printf("Инженер %s (%f) >>> Мне нужна эта вакансия! [%s - %f] Вакансия: (%s)\n",
                    name, minSalary, companyName, salary, vacanciesName);
            minSalary = salary;
        }
        else {
            System.out.printf("Инженер %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, salary);
        }
    }
}
