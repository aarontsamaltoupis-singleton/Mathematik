public class GeometrischeObjekteMain {
    public static void main(String[] args) {
        try{Quader q1 = new Quader(1,5,-1);}
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig.errorMessage());
        }
        try{Wuerfel w1 = new Wuerfel(-2);}
        catch(GeometrischesObjektException dimensionenUngueltig){
            System.out.println(dimensionenUngueltig.errorMessage());
        }
    }
    
}
