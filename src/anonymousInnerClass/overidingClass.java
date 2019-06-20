package anonymousInnerClass;

public class overidingClass {
    public overidingClass(){
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("method override");
            }
        };
        t.start();
    }
}
