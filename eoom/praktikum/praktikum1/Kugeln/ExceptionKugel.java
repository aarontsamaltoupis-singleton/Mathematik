public class ExceptionKugel extends Exception{
    private final double radius;

    public ExceptionKugel(final double radius){
        super("Fascher Wert fuer Radius: r= ");
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

}
