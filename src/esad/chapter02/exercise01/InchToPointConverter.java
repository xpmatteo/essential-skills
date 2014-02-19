package esad.chapter02.exercise01;

public class InchToPointConverter {
	// convert the quantity in inches to points.
	static float parseInch(float inch) {
		return inch * 72; // one inch contains 72 points.
	}
}

class Length {
	private static final int POINTS_PER_INCH = 72;
	float lengthInInches;
	private Length(float inches) {
		lengthInInches = inches;
	}
	public static Length fromInches(float inches) {
		return new Length(inches);
	}
	public static Length fromPoints(float points) {
		return new Length(points/POINTS_PER_INCH);
	}
	public float toPoints() {
		return lengthInInches * POINTS_PER_INCH;
	}
	public float toInches() {
		return lengthInInches;
	}
	
	public static void main(String[] args) {
		Length l = Length.fromInches(3.14f);
		System.out.println(l.toPoints());
	}
}
