package w11_2.semaphor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class FileCounter {
    private Semaphore semaphore = new Semaphore(1);
    private int count;

    public void increase() throws InterruptedException {
        semaphore.acquire();
        this.count = this.count+1;
        Thread.sleep(1000);
        semaphore.release();
    }

    int getCount(){
        return this.count;
    }

    boolean hasQueuedThreads(){
        return semaphore.hasQueuedThreads();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        FileCounter fileCounter = new FileCounter();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        fileCounter.increase();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileCounter.hasQueuedThreads());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileCounter.hasQueuedThreads());
        executorService.shutdown();

        System.out.println(fileCounter.getCount());
    }

}
