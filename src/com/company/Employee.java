package com.company;

public class Employee extends Person {

    private double salary;
    private int experience;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee(String name, String surname, int year, int experience, double basesal) {
        super(name, surname, year);
        this.salary = basesal+(experience*1300);
        this.experience = experience;
    }
}
