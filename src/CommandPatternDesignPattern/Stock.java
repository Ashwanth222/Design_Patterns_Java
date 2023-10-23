package CommandPatternDesignPattern;

public class Stock {
    private String name= "abc";
    private int quantity = 10;

    public void sell(){
    System.out.println("sell stock Quanty:" + quantity + "and name :" + name );
    }

    public void buy(){
        System.out.println("buy stock Quanty:" + quantity + "and name :" + name );
    }

}
