package esad.chapter03.aaa_intro.cad;

class CADApp {
  void drawShapes(Graphics graphics, Shape shapes[]) {
    for (int i = 0; i < shapes.length; i++) {
      switch (shapes[i].getType()) {
        case Shape.TYPELINE:
          graphics.drawLine(shapes[i].getP1(), shapes[i].getP2());
          break;
        case Shape.TYPERECTANGLE:
          // draw the four edges.
          graphics.drawLine(/* ... */);
          graphics.drawLine(/* ... */);
          graphics.drawLine(/* ... */);
          graphics.drawLine(/* ... */);
          break;
        case Shape.TYPECIRCLE:
          graphics.drawCircle(shapes[i].getP1(), shapes[i].getRadius());
          break;
        case Shape.TYPETRIANGLE: 
        	graphics.drawLine(shapes[i].getP1(), shapes[i].getP2()); 
        	graphics.drawLine(shapes[i].getP2(), shapes[i].getP3()); 
        	graphics.drawLine(shapes[i].getP3(), shapes[i].getP1()); 
        	break;
      }
    }
  }
}
