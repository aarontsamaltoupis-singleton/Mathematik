public class PythagoraeischeZahltripelMain{
    public static void tripelBedeutung(PythagoraeischeZahlentripel tripel){
        System.out.print("Es gibt ");
        tripel.gibtAnzahlAus();
        System.out.println(" Tripel (a,b,c) aus dem angegebenen Zahlenbereich, sodass a^2 +b^2 = c^2");
    }

    public static void main(String[] args) {
        PythagoraeischeZahlentripel tripel1 = new PythagoraeischeZahlentripel(1, 1000);
        tripelBedeutung(tripel1);
        PythagoraeischeZahlentripel tripel2 = new PythagoraeischeZahlentripel(1000, 2000);
        tripelBedeutung(tripel2);

    }
}
