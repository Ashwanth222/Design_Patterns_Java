package BuilderDesignPattern;

public class Coke extends CoolDrink{
    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {
        return "coke";
    }
}
