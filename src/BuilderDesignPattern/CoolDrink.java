package BuilderDesignPattern;

public abstract class CoolDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
    @Override
    public abstract float price();
}
