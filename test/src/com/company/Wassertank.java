package com.company;

public class Wassertank {
    private double Wasserstand;
    private final double maxWasserstand;

    public Wassertank(){
        maxWasserstand = 1;         //liter
        Wasserstand = maxWasserstand; //liter
    }
    public double getWasserstand(){
        return Wasserstand;
    }
    public void setWasserstand(double input){
        Wasserstand = input;
    }

    public void fuelleWasser(){
        setWasserstand(maxWasserstand);
    }
    public boolean Wasservorhanden(){
        return getWasserstand()>0;
    }
}
