package BuilderDesignPattern;

public class Pepsi extends CoolDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "pepsi";
    }
}
