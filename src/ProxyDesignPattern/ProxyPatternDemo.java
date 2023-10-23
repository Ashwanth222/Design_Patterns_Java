package ProxyDesignPattern;

public class ProxyPatternDemo {
    public static void main(String[] args){

        Image proxyImage = new ProxyImage("uhsd.txt") ;
//image will  be loaded from the disk
            proxyImage.display();

            System.out.println(" ");
// image will not be loaded from the disk
            proxyImage.display();

    }
}
