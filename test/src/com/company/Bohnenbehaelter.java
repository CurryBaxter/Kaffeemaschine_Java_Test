package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bohnenbehaelter {
    private double Bohnenmenge = 0;
    private double maxBohnen = 500;

    public Bohnenbehaelter(){
    }

    public double getBohnenmenge(){
        return this.Bohnenmenge;
    }

    public void setBohnenmenge(double input){
        this.Bohnenmenge = input;
    }
    public boolean Bohnenvorhanden(){
        return getBohnenmenge()>0;
    }

    public void fuelleBohnen(){
        Bohnenmenge = maxBohnen;
        System.out.println("Bohnen aufgefüllt");
    }


    public <T extends Kaffeesorte> void mahleBohnen(T kaffeesorte) {
        Scanner CLIbohnenmahlen = new Scanner(System.in);
        boolean KaffeeMoeglich  = getBohnenmenge() - kaffeesorte.getbohnenverbrauch() > 0 ;
        double bohnenverbrauch = getBohnenmenge() - kaffeesorte.getbohnenverbrauch();
        while (true) {
            if (KaffeeMoeglich) {
                setBohnenmenge(getBohnenmenge() - bohnenverbrauch);
                System.out.println("Bohnen gemahlen");
                break;
            } else {
                try {
                    System.out.println("Bohnen auffüllen?" + "\n" + "1: Ja" + "\n" + "2: Nein");
                    int choice = CLIbohnenmahlen.nextInt();

                    if (choice == 1) {
                        fuelleBohnen();
                        setBohnenmenge(getBohnenmenge() - bohnenverbrauch);
                        System.out.println("Bohnen gemahlen");
                        break;
                    } else if (choice == 2) {
                        System.out.println("Wähle eine andere Sorte oder fülle die Bohnen auf" + "\n" + "Die Bohnen haben einen Bestand von: " + getBohnenmenge() + " Gramm");
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
