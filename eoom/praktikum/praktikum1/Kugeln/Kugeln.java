public class Kugeln{
    public static void  main (String[] args){
        Kugel[] kugeln = new Kugel[3];
        kugeln[0] = new Kugel(5);
        kugeln[1]= new Kugel(7);
        kugeln[2]= new Kugel(-21);

        for (int index = 0; index < kugeln.length; ++index){
            System.out.println(
                "Radius "
                +kugeln[index].getRadius()+", "
                +"Oberflaeche: " +
                kugeln[index].getOberflaeche()+", "
                +"Volumen: " +
                kugeln[index].getVolumen()+", "
                +"Durchmesser "+
                kugeln[index].getDurchmesser()+", "
            );
        }
    }
}