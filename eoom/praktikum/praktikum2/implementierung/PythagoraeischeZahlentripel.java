public class PythagoraeischeZahlentripel {
    int[] speicherArray;
    int[] speicherQuadrate;
    int[] anzahlZahlentripel;

//Konstruktor
    public PythagoraeischeZahlentripel(int minimum, int maximum){
        speicherArray = UtilsForArrays.createIntArray(minimum, maximum);
        speicherQuadrate = UtilsForArrays.quadriere(speicherArray);
        UtilsForArrays.arrayInhaltAusgaben(speicherQuadrate);

        berechne();
    }

//Methoden
    public boolean istQuadratzahl(int zahl){
        
        return false;
    }

    public void berechne (){

    }


}