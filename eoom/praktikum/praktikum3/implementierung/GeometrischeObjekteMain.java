public class GeometrischeObjekteMain {
    public static void main(String[] args) {
        GeometrischeObjekte listeGeometrischeObjekte = new GeometrischeObjekte();

        try{
            GeometrischesObjekt q1 = new Quader(1,5,-1);
            listeGeometrischeObjekte.add(q1);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        try{
            GeometrischesObjekt w1 = new Wuerfel(2);
            listeGeometrischeObjekte.add(w1);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        listeGeometrischeObjekte.ausgeben();
    }
}