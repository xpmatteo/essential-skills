package esad.chapter03.aaa_intro.cad.refactored;

class CADApp {
	void drawShapes(Graphics graphics, Shape shapes[]) {
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw(graphics);
		}
	}
}
