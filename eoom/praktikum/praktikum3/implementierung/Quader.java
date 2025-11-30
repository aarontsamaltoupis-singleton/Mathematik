public class Quader {
    double laenge;
    double breite;
    double hoehe;
    Quader(double laenge, double breite, double hoehe)throws GeometrischesObjektException{
        if (laenge< 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+laenge);
        }
        else if (breite< 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+breite);
        }
        else if (laenge< 0){
            throw new GeometrischesObjektException("Quader: Parameter Laenge <0; Wert: "+laenge);
            }

        else{
            this.laenge=laenge;
            this.breite=breite;
            this.hoehe=hoehe;
        }
    }
    
}
