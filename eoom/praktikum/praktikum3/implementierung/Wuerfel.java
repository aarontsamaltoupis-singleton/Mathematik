public class Wuerfel implements GeometrischesObjekt{
    private double seitenlaenge;

    Wuerfel(float seitenlaenge) throws GeometrischesObjektException{
        if (seitenlaenge<0){
            throw new GeometrischesObjektException("Wuerfel:Parameter Seitenlaenge <0; Wert: "+seitenlaenge);
            
        }
        else{
            this.seitenlaenge=seitenlaenge;
        }
    }
    public double getSeitenlaenge(){
        return seitenlaenge;
    }

    @Override
    public double getVolumen(){
        return seitenlaenge*seitenlaenge*seitenlaenge;
    }
    @Override
    public double getOberflaeche(){
        return seitenlaenge*seitenlaenge;
    }

    @Override
    public String toString(){
        String daten="";
        daten += "hi";
        return daten.toString();
    }

}
