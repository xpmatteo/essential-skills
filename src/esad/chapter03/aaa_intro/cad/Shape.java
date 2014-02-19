package esad.chapter03.aaa_intro.cad;

class Shape {
	final static int TYPELINE = 0;
	final static int TYPERECTANGLE = 1;
	final static int TYPECIRCLE = 2;
	final static int TYPETRIANGLE = 3;
	int shapeType;
	
	// starting point of the line.
	// lower left corner of the rectangle.
	// center of the circle.
	Point p1;
	
	// ending point of the line.
	// upper right corner of the rectangle.
	// not used for the circle.
	Point p2;
	// last point of the triangle
	Point p3;
	
	Length radius;

	public int getType() {
		return shapeType;
	}
	public Point getP1() {
		return p1;
	}
	public Point getP2() {
		return p2;
	}
	public Length getRadius() {
		return radius;
	}
	public Point getP3() {
		return p3;
	}
}
