package com.company;

public class Kaffeemaschine {

    //Kaffeemaschine instanziiert alle Komponenten und macht so die Methoden verfügbar und dann später über die App aufrufbar
    // sorgt somit hoffentlich für übersichtlicheren Code
    Bohnenbehaelter Bohnenbehalter = new Bohnenbehaelter();
    Wassertank Wassertank = new Wassertank();
    Kaffeesatzbehaelter Kaffeesatzbehalter = new Kaffeesatzbehaelter();
    Milchtank Milchbehalter = new Milchtank();
    Wasserkocher Wasserkocher = new Wasserkocher();
    public void brueheKaffee(Kaffeesorte a){
        if(Kaffeesatzbehalter.KSbehaelternichtvoll() && Wassertank.Wasservorhanden() && Bohnenbehalter.Bohnenvorhanden()) {
            //mahle Bohnen, koche Wasser etc
            Bohnenbehalter.mahleBohnen(a);
            if(a.milkrequired)
                Milchbehalter.schauemeMilch(a);
            Wasserkocher.kocheWasser();

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
