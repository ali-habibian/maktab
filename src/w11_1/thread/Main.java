package w11_1.thread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }

        System.out.println(""+Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
