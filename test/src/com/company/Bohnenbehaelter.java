package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bohnenbehaelter {
    private double Bohnenmenge = 0;
    private double maxBohnen = 500;

    public void initChoiceArray(){
        ArrayList<Integer> validChoices = new ArrayList<>();
        validChoices.add(1);
        validChoices.add(2);
    }
    public Bohnenbehaelter(){
    }

    public double getBohnenmenge(){
        return this.Bohnenmenge;
    }

    public void setBohnenmenge(double input){
        this.Bohnenmenge = input;
    }

    public void fuelleBohnen(){
        Bohnenmenge = maxBohnen;
        System.out.println("Bohnen aufgefüllt");
    }


    public <T extends Kaffeesorte> void mahleBohnen(T kaffeesorte) {
        Scanner CLIbohnenmahlen = new Scanner(System.in);
        double verbrauch  = getBohnenmenge() - kaffeesorte.getbohnenverbrauch();
        double neuerBohnenstand = 0;
        while (true) {
            if (verbrauch>=0) {
                neuerBohnenstand = getBohnenmenge() - verbrauch;
                setBohnenmenge(neuerBohnenstand);
                System.out.println("Bohnen gemahlen");
                break;
            } else {
                try {
                    System.out.println("Bohnen auffüllen?" + "\n" + "1: Ja" + "\n" + "2: Nein");
                    int choice = CLIbohnenmahlen.nextInt();

                    if (choice == 1) {
                        fuelleBohnen();
                        neuerBohnenstand = getBohnenmenge() - verbrauch;
                        setBohnenmenge(neuerBohnenstand);
                        System.out.println("Bohnen gemahlen");
                        break;
                    } else if (choice == 2) {
                        System.out.println("Wähle eine andere Sorte oder fülle die Bohnen auf" + "\n" + "Sie haben einen Bestand von: " + getBohnenmenge() + " Gramm");
                        break;
                    } else {
                        System.out.println("Ungültige Eingabe: Nur 1 oder 2 sind erlaubt. Bitte versuchen Sie es erneut.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ungültige Eingabe: Nur Integer-Werte werden akzeptiert. Bitte versuchen Sie es erneut.");
                    CLIbohnenmahlen.nextLine();
                }
            }
        }
    }
}
