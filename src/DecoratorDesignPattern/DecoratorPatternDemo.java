package DecoratorDesignPattern;

public class DecoratorPatternDemo {
    public static  void main(String[] args){
Circle circle = new Circle();

        Shape redCircle = new RedShapeDecorator(circle);
        System.out.println("circle with normal border");
        circle.draw();
        System.out.println("circle with red border");
        redCircle.draw();
        Rectangle rectangle = new Rectangle();
        System.out.println("rectangle with red border");
        Shape redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
}
