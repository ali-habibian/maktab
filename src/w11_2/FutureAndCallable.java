package w11_2;

import java.util.concurrent.*;

public class FutureAndCallable {
    public static void main(String[] args) {
        Virus virus = new Virus();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(new MyCallable(virus));

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<Integer> {
    private Virus virus;

    public MyCallable(Virus virus) {
        System.out.println("Start..." + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            virus.increment();
        }
        System.out.println("Done..." + Thread.currentThread().getName());
        this.virus = virus;
    }

    @Override
    public Integer call() throws Exception {
        return virus.getCount();
    }
}
