package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;
/*
Создание нового класса "Вакансия"
Перенос метода needEmployee в класс вакансия для исключения добавления в класс нового свойства vacanciesName.
 */
public class Vacancies extends Company{

    private String vacanciesName;

    public Vacancies(String companyName, double maxSalary, Publisher jobAgency, String vacanciesName) {
        super(companyName, maxSalary, jobAgency);
        this.vacanciesName = vacanciesName;
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(companyName, salary, vacanciesName);
    }
}
