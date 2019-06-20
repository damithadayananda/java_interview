package algorithm.deadlock;

public class noDeadLock {
    public void methodOne(){
        synchronized (String.class){
            System.out.println("Acquiring lock on String class");
        }
        synchronized (Integer.class){
            System.out.println("Acquiring lock on Integer class");
        }
    }
    public void methodTwo(){
        synchronized (String.class){
            System.out.println("Acquiring lock on String class");
        }
        synchronized(Integer.class){
            System.out.println("Acquiring lock on integer class");
        }
    }

}
