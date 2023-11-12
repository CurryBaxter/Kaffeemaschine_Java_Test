package com.company;

public class Wasserkocher {
    Wassertank Wassertank = new Wassertank();
    public Wasserkocher(){
    }
    public int kocheWasser(){
        if(Wassertank.Wasservorhanden() && Wassertank.getWasserstand() >=0.125) {
            Wassertank.setWasserstand(Wassertank.getWasserstand() - 0.125);

            return 1;
        }
        return 0;
    }
}
