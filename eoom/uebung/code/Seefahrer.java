package Menschen;
public class Seefahrer extends Mensch{
    private String name;
    public static int seefahrerzaehler;

    public Seefahrer(int alter, String name){
        super(alter);
        this.name = name;
        seefahrerzaehler++;
    }
   
    @Override
    public void vorstellen(){
        System.err.println("Ahoy, ich bin "+ name);
    }
    
}
