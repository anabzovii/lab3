package com.company;

import java.time.LocalDate;

public class Security extends Employee{
    private int heightcm;


    public int getHeightcm() {
        return heightcm;
    }

    public void setHeightcm(int heightcm) {
        this.heightcm = heightcm;
    }


    public Security(String name, String surname, int heightcm,  int year, int experience) {
        super(name,surname,year,experience,7500);
        this.heightcm = heightcm;
    }
}
