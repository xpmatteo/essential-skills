package esad.chapter03.aaa_intro.cad.refactored;

abstract class Shape {
	abstract void draw(Graphics graphics);
}

class Line extends Shape {
	Point startPoint;
	Point endPoint;
	public Point getStartPoint() {
		throw new RuntimeException("Not yet implemented!");
	}
	public Point getEndPoint() {
		throw new RuntimeException("Not yet implemented!");
	}
	void draw(Graphics graphics) {
		graphics.drawLine(startPoint, endPoint);
	}
}

class Rectangle extends Shape {
	Point lowerLeftCorner;
	Point upperRightCorner;
	void draw(Graphics graphics) {
		graphics.drawLine(/* ... */);
		graphics.drawLine(/* ... */);
		graphics.drawLine(/* ... */);
		graphics.drawLine(/* ... */);
	}
}

class Circle extends Shape {
	Point center;
	Length radius;
	void draw(Graphics graphics) {
		graphics.drawCircle(center, radius);
	}
}
