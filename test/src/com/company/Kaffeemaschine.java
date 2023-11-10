package com.company;

public class Kaffeemaschine {
    Bohnenbehaelter Bohnenbehalter = new Bohnenbehaelter();
    Wassertank Wassertank = new Wassertank();
    Kaffeesatzbehaelter Kaffeesatzbehalter = new Kaffeesatzbehaelter();
    public void brueheKaffee(){
        if(Kaffeesatzbehalter.KSbehaelternichtvoll() && Wassertank.Wasservorhanden() && Bohnenbehalter.Bohnenvorhanden()) {
            //mahle Bohnen, koche Wasser etc
        }
    }




    /* Die Klasse Kaffeemaschine soll alle notwendigen Operationen aus den
    anderen Klassen zusammenführen und so eine Nutzeroberfläche bieten, in der z.B. die Bohnen gemahlt, der Wasserstand geprüft, ...
    und dann ein Kaffee aus einer Liste gebrüht werden kann.

    Wichtig ist, dass die Kaffeemaschine alle nötigen Parameter verifiziert und dann erst Aktionen ausführt, welche durch eine Abfrage
    durch den Nutzer bestimmt wird.

    Generelle Merkmale:
    - Bohnebehälter welcher Kaffee mahlt und Bohnenstand automatisch prüft
    - Wassertank, welcher Wasserstand prüft
    - Kaffeesatzbehälter, welche Kaffeesatzmenge prüft
    - Wasser"kocher", welcher Wasser für den Kaffee erhitzt
    - User wird anhand von Fragestellungen zum Kaffee gebracht (Spielerei mit Fehlercodes und Treemap möglich)
     */
}
