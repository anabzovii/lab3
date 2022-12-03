package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        Aeroport aeroport = new Aeroport("Chisianu", "Dacia 55");
        System.out.println("Aeroportul " + aeroport.getName() +" se afla pe strada " + aeroport.getAddress());

        System.out.println("----------------------------------------------------");

        Avion a1 = new Avion(200,71000,"Boeing 7000");
        System.out.println("Avionul "+ a1.getModel()+" poate zbura "+ a1.Flydistance(a1.getFueltank())+ " km");


        System.out.println("----------------------------------------------------");

        Bilet b1 = new Bilet("Moldova","Italia",700, LocalDate.now());
        System.out.println("Biletul "+ b1.getId() + " se deplaseaza de la "+b1.getCountryin() + " la " + b1.getCountryout() + " la " + b1.getData());
        b1.setData(LocalDate.now().plusDays(2));
        System.out.println("Biletul "+ b1.getId() + " se deplaseaza de la "+b1.getCountryin() + " la " + b1.getCountryout() + " la " + b1.getData());

        System.out.println("----------------------------------------------------");
        Operator o1 = new Operator("Josan", "Oxana", 1999, 6);
        o1.getSalary();
        System.out.println("Operatorul "+ o1.getSurname() +" "+o1.getName() +" are salariul " + o1.getSalary());

    }
}
