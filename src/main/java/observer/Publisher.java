package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

public interface Publisher {

    /**
     * Регистрация нового наблюдателя
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Убрать наблюдателя из списка
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * Компания отправляет новую вакансию
     * @param companyName
     * @param salary
     */
    /*
    Добавлено свойство vacanciesName в издателя.
     */
    void sendOffer(String companyName, double salary, String vacanciesName);


}
