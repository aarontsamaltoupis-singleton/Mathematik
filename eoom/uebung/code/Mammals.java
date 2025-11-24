import Menschen.*;

public class  Mammals{
    public static void main(String[] args) {
        Seefahrer Tom = new Seefahrer(15, "Tom");
        Tom.vorstellen();        
        Mensch Paul = new Mensch(15);
        System.out.println(Mensch.menschenzaehler);
        System.out.println(Seefahrer.seefahrerzaehler);
    }
}
