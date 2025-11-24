package Menschen;
public class Mensch implements Vorstellend{
    //Attribut
    private int alter;
    
    //Klassenvariable
    public static int menschenzaehler = 0;

    public Mensch(int alter){
        this.alter = alter;
        menschenzaehler++;
    }
    @Override
    public void vorstellen(){
        System.err.println("Hallo ich bin ein Mensch und bin "+alter+ " Jahre alt.");
    }
}