package GeeksForGeeks.SingletonPattern;

public class Singleton {

    String s = "this is the message";
    private static Singleton instance = null;
    private Singleton(){
        this.s = s;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
