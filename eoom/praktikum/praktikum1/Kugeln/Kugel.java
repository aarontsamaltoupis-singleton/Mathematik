public class Kugel{
    private double radius;
    public final double PI=3.14;

    public Kugel(){
        radius = 1.0;
    }

    public Kugel(double radius){
        this.radius=radius;
    }


    public double getRadius(){
        return radius;
    }
    public double getOberflaeche(){
        double oberflaeche = 4*PI*radius*radius;
        return oberflaeche;
    }
    public double getVolumen(){
        double volumen;
        volumen=(4/3)*PI*radius*radius*radius;
        return volumen;
    }
    public double getDurchmesser(){
        double durchmesser;
        durchmesser=2*radius;
        return durchmesser;
    }
}