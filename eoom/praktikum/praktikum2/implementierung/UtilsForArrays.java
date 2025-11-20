public  class UtilsForArrays{
    public int[] createIntArray (int minimum, int maximum){

        int[] arrayMinMax = new int[(maximum+1)- minimum];
        for (int index = 0;index<arrayMinMax.length;++ index){
            arrayMinMax[index]=minimum+(index);
        }
        return arrayMinMax;
    }

    public int[] quadriere (int[] eingabeArray){
        int[] quadrierterArray = new int[eingabeArray.length];

        for (int index = 0;index<quadrierterArray.length;++ index){
            quadrierterArray[index]=eingabeArray[index]*eingabeArray[index];
        }

        return quadrierterArray;
    }

    public void arrayInhaltAusgeben (int[] eingabeArray){
        for (int index=0;index<eingabeArray.length; ++ index){
            System.out.print(eingabeArray[index]+",");
        }
    }
}