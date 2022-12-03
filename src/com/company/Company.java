package com.company;

import java.time.LocalDate;

public class Company extends Base{
    private String name;
    private int nravioane;
    private float buget;
    private LocalDate contractin;
    private LocalDate contractout;
    private int aeroport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNravioane() {
        return nravioane;
    }

    public void setNravioane(int nravioane) {
        this.nravioane = nravioane;
    }

    public float getBuget() {
        return buget;
    }

    public void setBuget(float buget) {
        this.buget = buget;
    }

    public LocalDate getContractin() {
        return contractin;
    }

    public void setContractin(LocalDate contractin) {
        this.contractin = contractin;
    }

    public LocalDate getContractout() {
        return contractout;
    }

    public void setContractout(LocalDate contractout) {
        this.contractout = contractout;
    }

    public int getAeroport() {
        return aeroport;
    }

    public void setAeroport(int aeroport) {
        this.aeroport = aeroport;
    }

    public Company(String name, int nravioane, float buget, LocalDate contractin, LocalDate contractout, int aeroport) {
        super();
        this.name = name;
        this.nravioane = nravioane;
        this.buget = buget;
        this.contractin = contractin;
        this.contractout = contractout;
        this.aeroport = aeroport;
    }
}
