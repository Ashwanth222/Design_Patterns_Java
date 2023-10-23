package ProxyDesignPattern;

public class RealImage implements Image{

    public String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
    System.out.println("loading the real file name" + fileName);
    }
    @Override
    public void display(){
        System.out.println("display real image..");
    }



}
