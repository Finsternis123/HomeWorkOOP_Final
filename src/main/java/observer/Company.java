package JavaWork.OOPHomeWork.HomeWork_Final.src.main.java.observer;

import java.util.Random;

public class Company {

    protected static  Random random = new Random();

    protected String companyName;
    protected double maxSalary;
    protected Publisher jobAgency;

    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }
}
