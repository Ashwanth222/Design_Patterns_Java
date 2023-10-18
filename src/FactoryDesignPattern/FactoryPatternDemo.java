package FactoryDesignPattern;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape4 = shapeFactory.getShape("CIRCLE");
        shape4.draw();

        Shape shape5 = shapeFactory.getShape("RECTANGLE");
        shape5.draw();

        Shape shape6 = shapeFactory.getShape("SQUARE");
        shape6.draw();
    }

}
