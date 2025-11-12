public class Kreis implements Statistik {
	private double radius;
	
	public Kreis(final double radius) {
	setRadius(radius);
	}
	...
	
	@Override
	public double getFlaecheninhalt(){
	return ...;
	}
	
	@Override
	public double getUmfang(){
	return ...;
	}
}