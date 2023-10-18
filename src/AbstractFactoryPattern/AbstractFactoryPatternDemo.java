package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = abstractFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape2 = abstractFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = abstractFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("COLOR");
        Color color = abstractFactory1.getColor("RED");
        color.fill();
        Color color1 = abstractFactory1.getColor("BLUE");
        color1.fill();
        Color color2 = abstractFactory1.getColor("GREEN");
        color2.fill();





//no factory producer method
//        AbstractFactory abstractFactory = new ShapeFactory();
//        Shape shape = abstractFactory.getShape("CIRCLE");
//        shape.draw();
//        abstractFactory.getShape("RECTANGLE");
//        abstractFactory.getShape("SQUARE");
//
//        AbstractFactory abstractFactory2 = new ColorFactory();
//        abstractFactory2.getColor("RED");
//        abstractFactory2.getColor("BLUE");
//        abstractFactory2.getColor("GREEN");

    }
}
