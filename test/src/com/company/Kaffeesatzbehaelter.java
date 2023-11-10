package com.company;

public class Kaffeesatzbehaelter {
    double MengeKaffeesatz;
    private final double maxKaffeesatz = 200; //gramm


    public Kaffeesatzbehaelter(){
        MengeKaffeesatz = 0;
    }

    public double getMengeKaffeesatz() {
        return MengeKaffeesatz;
    }

    public void setMengeKaffeesatz(double mengeKaffeesatz) {
        MengeKaffeesatz = mengeKaffeesatz;
    }

    public void leereBehaelter(){
        setMengeKaffeesatz(0);
    }

    public boolean KSbehaelternichtvoll(){             //wird in anderen Funktionen der Kaffeemaschine aufgerufen, um mehrfach gleichen Code zum Prüfen des Bestandes zu vermeiden
        return MengeKaffeesatz<maxKaffeesatz;
        }
    }

