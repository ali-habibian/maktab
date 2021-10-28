package w11_2;

import w11_1.thread.join.ScanThread;
import w11_1.thread.join.Virus;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        /*ExecutorService executorService = Executors.newFixedThreadPool(5);
        w11_1.thread.join.Virus virus = new Virus();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new ScanThread(virus));
        }

        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println(virus.getCount());
    }*/
        System.out.println(LocalDate.now());
        
    }
}
