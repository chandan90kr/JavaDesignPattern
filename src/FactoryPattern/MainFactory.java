package FactoryPattern;

public class MainFactory {

    public static void main(String[] args) {
        ShapeFacory shapeFacory = new ShapeFacory();
        Shape shape = shapeFacory.getShape("CIRCLE");
        Shape shape1 = shapeFacory.getShape("RECTANGLE");
        Shape shape2 = shapeFacory.getShape("SQUARE");
        shape.draw();
        shape1.draw();
        shape2.draw();
    }
}
