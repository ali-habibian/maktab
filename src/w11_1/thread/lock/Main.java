package w11_1.thread.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        MessageEntity twoA = new MessageEntity("2", "A");
        MessageEntity three = new MessageEntity("3", "B");
        MessageEntity four = new MessageEntity("4", "C");
        MessageEntity twoD = new MessageEntity("2", "D");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        List<Future<List<List<Boolean>>>> futures = new ArrayList<>();
        List<List<List<Boolean>>> myCallables = new ArrayList<>();


            Future<List<List<Boolean>>> future = executorService.submit(new MyCallable(twoA, three, four, twoD));
            try {
                List<List<Boolean>> myCallable = future.get();
                myCallables.add(myCallable);
                futures.add(future);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        for (List<List<Boolean>> m: myCallables) {
            System.out.println(m);
        }
        executorService.shutdown();
    }
}