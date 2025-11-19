public class PythagoraeischeZahlentripel //extends UtilsForArrays
{
    private int[] speicherArray;
    private int[] speicherQuadrate;
    private int anzahlZahlentripel;
    private int minimum;
    private int maximum;

    public PythagoraeischeZahlentripel(int minimum, int maximum){
        this.minimum = minimum;
        this.maximum =maximum;

        speicherArray = UtilsForArrays.createIntArray(minimum, maximum);
        speicherQuadrate = UtilsForArrays.quadriere(speicherArray);
        UtilsForArrays.arrayInhaltAusgaben(speicherQuadrate);
        berechne();
    }

    public boolean istQuadratzahl(int zahl){
        boolean returnvalue;
        double zahlSqareroot = Math.sqrt(zahl);

        if (Math.abs((zahlSqareroot-Math.floor(zahlSqareroot)))<0.0001){
            returnvalue = true;
        }
        else{
            returnvalue=false;
        }

        return returnvalue;
    }

    private void berechne (){
        int differenz;

        for (int indexj = 0;indexj < speicherQuadrate.length;++ indexj){
            for (int indexi = 0;indexi<indexj;++ indexi){
                differenz=speicherQuadrate[indexj]-speicherQuadrate[indexi];

                if(istQuadratzahl(differenz)==true && differenz>speicherQuadrate[indexi]){
                    anzahlZahlentripel += 1;              
                }
            }
        }
    }

    public void gibtAnzahlAus(){
        System.out.print(anzahlZahlentripel);
    }

    public int getMinimum(){
        return minimum;
    }

    public int getMaximum(){
       return maximum;
    }
}