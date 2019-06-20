package concurrency;

import java.util.concurrent.CountDownLatch;

public class countDownLatch {
    private class service implements Runnable{
        private final String name;
        private final int timeToStart;
        private final CountDownLatch latch;

        public service(String name,int timeToStart,CountDownLatch latch){
            this.name=name;
            this.timeToStart=timeToStart;
            this.latch=latch;
        }
        @Override
        public void run(){
            try {
                System.out.println("fallen asleep");
                Thread.sleep(timeToStart);
            }catch (Exception e){
                e.printStackTrace();
            }
            latch.countDown();
        }
    }

    public countDownLatch(){
        final CountDownLatch latch = new CountDownLatch(3);
        Thread cacheService = new Thread(new service("Cache Service",1000,latch));
        Thread alertService = new Thread(new service("alert service",1000,latch));

        cacheService.start();
        alertService.start();
        System.out.println("going to start two services");
        try{
            System.out.println("start waiting");
            latch.await();
            System.out.println("all service up good to go");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
