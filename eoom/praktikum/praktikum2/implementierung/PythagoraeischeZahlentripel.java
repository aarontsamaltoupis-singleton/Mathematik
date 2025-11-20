public class PythagoraeischeZahlentripel extends UtilsForArrays{
    private int[] speicherArray;
    private int[] speicherQuadrate;
    private int anzahlZahlentripel;

    public PythagoraeischeZahlentripel(int minimum, int maximum){
        speicherArray = createIntArray(minimum, maximum);
        speicherQuadrate = quadriere(speicherArray);
        arrayInhaltAusgeben(speicherQuadrate);

        berechne();
    }

    public boolean istQuadratzahl(int zahl){
        boolean returnvalue = false;
        if (Math.sqrt(zahl)-Math.floor(Math.sqrt(zahl))<0.0001){
            returnvalue = true;
        }
        return returnvalue;
    }

    private void berechne (){
        System.out.println("");

        for (int indexj = 0;indexj<speicherQuadrate.length;++ indexj){
            for (int indexi = 0;indexi<indexj;++ indexi){
                int differenz=speicherQuadrate[indexj]-speicherQuadrate[indexi];
                if(istQuadratzahl(differenz)==true && differenz>speicherQuadrate[indexi]){
                    anzahlZahlentripel += 1;
                    System.out.println(speicherArray[indexi]+"^2+"+Math.abs(Math.sqrt(differenz))+"^2="+speicherArray[indexj]+"^2");
                }
            }
        }
    }

    public void gibtAnzahlAus(){
        System.out.println(anzahlZahlentripel);
    }
}