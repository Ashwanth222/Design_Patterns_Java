package GeeksForGeeks.SingletonPattern;

public class SingletonMain {
    public static void main(String[] args){
        Singleton x =Singleton.getInstance();
        Singleton y =Singleton.getInstance();
        Singleton z =Singleton.getInstance();

       x.s = x.s.toUpperCase();

        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);

        x.s = x.s.toLowerCase();

        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);

    }
}
