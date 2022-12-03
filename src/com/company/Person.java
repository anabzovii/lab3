package com.company;

public class Person extends Base{
    private String name, surname;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

}
