package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        /*
        Добавлено название вакансии.
         */
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Vacancies("GeekBrains", 70000, jobAgency, "IT specialist");
        Company google = new Vacancies("Google", 100000, jobAgency, "Design Engineer");
        Company yandex = new Vacancies("Yandex", 120000, jobAgency, "Tester");

        Master ivanov = new Master("Ivanov");
        Student sidorov = new Student("Sidorov");
        Engineer filipov = new Engineer("Filipov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(filipov);

        for (int i = 0; i < 1; i++){
            ((Vacancies) geekBrains).needEmployee();
            ((Vacancies) google).needEmployee();
            ((Vacancies) yandex).needEmployee();
        }
    }

}
