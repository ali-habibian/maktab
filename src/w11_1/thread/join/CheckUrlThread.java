package w11_1.thread.join;

public class CheckUrlThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start checking url...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Checking url done!");
    }
}
