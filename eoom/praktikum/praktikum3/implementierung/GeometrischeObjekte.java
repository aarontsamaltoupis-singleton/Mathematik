import java.util.ArrayList;

public class GeometrischeObjekte {
    ArrayList<GeometrischesObjekt> geometrischeObjekte = new ArrayList<>();
    GeometrischeObjekte(){

    }
    public void add(GeometrischeObjekt neuesElement){
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

    public int getAnzahl(){
        return geometrischeObjekte.size(); 
    }
    public void ausgeben(){
        for(GeometrischesObjekt objekt:geometrischeObjekte){
            System.out.println(objekt);
        }
        System.out.println(getAnzahl()
        +"gesamte Oberflaeche:" +berecheGesamteOberflaeche()
        +"gesamtes Volumen: "+berechneGesamtesVolumen());
    }
    }
    



