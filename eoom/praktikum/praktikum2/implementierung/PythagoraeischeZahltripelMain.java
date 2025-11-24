public class PythagoraeischeZahltripelMain{
    public static void tripelBedeutung(PythagoraeischeZahlentripel tripel){
        System.out.println("Es gibt ");
        tripel.gibtAnzahlAus();
        System.out.println("Tripel (a,b,c) bestehend aus den Zahlen zwischen "+tripel.getMinimum() +" und " +tripel.getMaximum()+", sodass a^2 +b^2 = c^2");
    }

    public static void main(String[] args) {
        PythagoraeischeZahlentripel tripel1 = new PythagoraeischeZahlentripel(1, 1000);
        tripelBedeutung(tripel1);
        PythagoraeischeZahlentripel tripel2 = new PythagoraeischeZahlentripel(1, 2000);
        tripelBedeutung(tripel2);

    }
}
