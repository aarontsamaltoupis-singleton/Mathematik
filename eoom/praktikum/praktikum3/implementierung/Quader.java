public class Quader implements GeometrischesObjekt{
    private double laenge;
    private double breite;
    private double hoehe;
    Quader(double laenge, double breite, double hoehe)throws GeometrischesObjektException{
        if (laenge < 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+laenge);
        }
        else if (breite< 0){
            throw new GeometrischesObjektException("Quader: Parameter Breite <0; Wert: "+breite);
        }
        else if (hoehe< 0){
            throw new GeometrischesObjektException("Quader: Parameter Hoehe <0; Wert: "+hoehe);
            }

        else{
            this.laenge=laenge;
            this.breite=breite;
            this.hoehe=hoehe;
        }
    }
    @Override
    public double getOberflaeche(){
        return (hoehe+laenge)*breite*2;
    }
    @Override
    public double getVolumen(){
        return(hoehe*laenge*breite);
    }
    public double getLaenge(){
        return(laenge);
    }
    public double getBreite(){
        return(breite);
    }
    public double getHoehe(){
        return(hoehe);
    }
    @Override
    public String toString(){
        String daten = "Quader mit ";
        daten += "Länge = "+ getLaenge()+", ";
        daten += "Breite = "+ getBreite()+", ";
        daten += "Höhe = "+ getHoehe()+", ";
        daten += "Volumen = "+ getVolumen()+", ";
        daten += "Oberfläche = "+ getOberflaeche();
        return daten;
    }
}
