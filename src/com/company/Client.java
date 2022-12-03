package com.company;

public class Client extends Person {
    private int nrzboruri;
    private int aeroport;


    public int getNrzboruri() {
        return nrzboruri;
    }

    public void setNrzboruri(int nrzboruri) {
        this.nrzboruri = nrzboruri;
    }

    public int getAeroport() {
        return aeroport;
    }

    public void setAeroport(int aeroport) {
        this.aeroport = aeroport;
    }

    public Client(String name, String surname, int nrzboruri, int aeroport, int year) {
        super(name,surname,year);
        this.nrzboruri = nrzboruri;
        this.aeroport = aeroport;
    }
}
