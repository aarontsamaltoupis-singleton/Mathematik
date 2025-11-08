public class UtilsForArrays{
    public UtilsForArrays (){

    }

    public static int[] createIntArray (int minimum, int maximum){

        int[] array = new int[(maximum+1)- minimum];
        System.out.println(array.length);
        for (int index = 0;index<array.length;++ index){
            array[index]=minimum+(index);
        }
        return array;
    }
}