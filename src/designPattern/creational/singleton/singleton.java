package designPattern.creational.singleton;

public class singleton {
    private static singleton instance=new singleton();
    private singleton(){

    }
    public static singleton getInstance(){
        return  instance;
    }
}
