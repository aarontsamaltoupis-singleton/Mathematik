public class PythagoraeischeZahlentripel {
    int[] speicherArray;
    int[] speicherQuadrate;
    int anzahlZahlentripel;

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
        if (Math.sqrt(zahl)-Math.floor(Math.sqrt(zahl))<0.0001){
            returnvalue = true;
        }
        return returnvalue;
    }

    public void berechne (){

        for (int indexj = 0;indexj<speicherQuadrate.length;++ indexj){
            for (int indexi = 0;indexi<indexj;++ indexi){
                int differenz=speicherQuadrate[indexj]-speicherQuadrate[indexi];
                if(istQuadratzahl(differenz)==true && differenz>speicherQuadrate[indexi]){
                    anzahlZahlentripel += 1;              
                }
            }
        }
    }

    public void gibtAnzahlAus(){
        System.out.println(anzahlZahlentripel);
    }


}