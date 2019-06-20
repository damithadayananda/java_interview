package anonymousInnerClass;

public class overidingInterface {
    public overidingInterface(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("interface overide");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
