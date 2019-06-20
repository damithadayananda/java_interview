package algorithm.deadlock;

/**
 * when this code access by several threads it possible to occur deadlock
 * methodOne done on string and waiting for integer while
 * methodTwo done on Integer and waiting for string
 */
public class possibleDeadLockCode {
    public void methodOne(){
        synchronized (String.class){
            System.out.println("Acquiring lock on String class");
        }
        synchronized (Integer.class){
            System.out.println("Acquiring lock on Integer class");
        }
    }
    public void methodTwo(){
        synchronized(Integer.class){
            System.out.println("Acquiring lock on integer class");
        }
        synchronized (String.class){
            System.out.println("Acquiring lock on String class");
        }
    }

}
