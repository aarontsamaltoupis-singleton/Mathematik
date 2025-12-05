import java.util.ArrayList;

public class GeometrischeObjekte{
    private ArrayList<GeometrischesObjekt> geometrischeObjekte;

    public GeometrischeObjekte(){
        this.geometrischeObjekte= new ArrayList<>();
    }

    public void add(GeometrischesObjekt neuesElement){
        geometrischeObjekte.add(neuesElement);
    }

    public double berechneGesamtesVolumen(){
        double summe=0;
        for(GeometrischesObjekt objekt:geometrischeObjekte){
            summe += objekt.getVolumen();
        }
        return summe;
    }

    public double berecheGesamteOberflaeche(){
        double summe =0;
        for(GeometrischesObjekt objekt:geometrischeObjekte){
            summe += objekt.getOberflaeche();
        }
        return summe;
    }

    private int getAnzahl(){
        return geometrischeObjekte.size(); 
    }
    public void ausgeben(){
        for(GeometrischesObjekt objekt:geometrischeObjekte){
            System.out.println(objekt);
        }
        System.out.println("Anzahl der gespeicherten geometrischen Objekte: "+getAnzahl());
        System.out.println("gesamte Oberflaeche: " +berecheGesamteOberflaeche());
        System.out.println("gesamtes Volumen: "+berechneGesamtesVolumen());
        }
    }
    



