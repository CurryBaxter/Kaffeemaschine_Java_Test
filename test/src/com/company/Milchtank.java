package com.company;

public class Milchtank {
    private double Milch;
    private final double maxMilch = 500;

    public Milchtank(){
        Milch= maxMilch;
    }
    public <T extends Kaffeesorte> void schauemeMilch(T kaffeesorte){
        if (kaffeesorte instanceof Cappucino){
            Milch -= 50;
            System.out.println("Milch geschäumt");
        }
        // je nach Kaffeeangebot erweiterbar
    }
}
