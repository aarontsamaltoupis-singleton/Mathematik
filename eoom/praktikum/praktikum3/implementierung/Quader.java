public class Quader implements GeometrischesObjekt{
    double laenge;
    double breite;
    double hoehe;
    Quader(double laenge, double breite, double hoehe)throws GeometrischesObjektException{
        if (laenge < 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+laenge);
        }
        else if (breite< 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+breite);
        }
        else if (hoehe< 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+hoehe);
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
    //@Override
    //public String toString(){
   //     return
    //}

    
}
