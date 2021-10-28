package w11_2.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        String url;
        List<Future<List<User>>> futures = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
//            url = i % 2 == 0 ? "www.yahoo.com" : "www.google.com";

            int mod = i%2;
            url = switch(mod){
                case 0 -> "www.yahoo.com";
                case 1 -> "www.google.com";
                default -> throw new IllegalStateException("Unexpected value: " + mod);
            };

            Future<List<User>> future = executorService.submit(new MyCallable(url));
            futures.add(future);
        }

        for (var future : futures)
            try {
                List<User> users = future.get();
                for (var user : users)
                    System.out.println(user);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }

        executorService.shutdown();
    }

}
