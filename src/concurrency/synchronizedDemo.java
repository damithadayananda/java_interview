package concurrency;

public class synchronizedDemo{
    public synchronized void synchronized_demo(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<10;i++){
           System.out.println(i);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void execute_synchronized_demo(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                synchronized_demo();
            }
        };
        new Thread(r,"ONE").start();
        new Thread(r,"TWO").start();
    }
}
