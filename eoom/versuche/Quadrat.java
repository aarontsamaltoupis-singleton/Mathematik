public class Quadrat implements Statistik{
       private double a;
       
       public Quadrat(final double a){
       }

       @Override
       public double getFlaecheninhalt(){
           return a;
       }
       @Override
       public double getUmfang(){
           return a*a;
       }
}
