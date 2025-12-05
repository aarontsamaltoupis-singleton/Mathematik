public class GeometrischeObjekteMain {
    public static void main(String[] args) {
        GeometrischeObjekte listeGeometrischeObjekte = new GeometrischeObjekte();

        //Quader
        try{
            GeometrischesObjekt q1 = new Quader(3,4,5);
            listeGeometrischeObjekte.add(q1);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        try{
            GeometrischesObjekt q2 = new Quader(16,-1,15);
            listeGeometrischeObjekte.add(q2);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        try{
            GeometrischesObjekt q3 = new Quader(200,200,200);
            listeGeometrischeObjekte.add(q3);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }

        //Wuerfel
        try{
            GeometrischesObjekt w1 = new Wuerfel(-207.15);
            listeGeometrischeObjekte.add(w1);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        try{
            GeometrischesObjekt w2 = new Wuerfel(4);
            listeGeometrischeObjekte.add(w2);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }
        try{
            GeometrischesObjekt w3 = new Wuerfel(200);
            listeGeometrischeObjekte.add(w3);
        }
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig);
        }

        listeGeometrischeObjekte.ausgeben();
    }
}