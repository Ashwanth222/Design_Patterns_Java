package SingletonDesignPattern;

import java.io.Serializable;

public class SingletonPatternDemo{
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
