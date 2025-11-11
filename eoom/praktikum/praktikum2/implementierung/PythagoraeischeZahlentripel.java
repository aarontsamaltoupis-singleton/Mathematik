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
        boolean returnvalue = false;
        if (Math.sqrt(zahl)-Math.floor(Math.sqrt(zahl))<0.01){
            returnvalue = true;
        }
        return returnvalue;
    }

    public void berechne (){
        int differenz=1;

        for (int index = 0;index<speicherQuadrate.length;++ index){
            if(istQuadratzahl(differenz)==true && differenz>array[i]){

        }


        }
    }


}