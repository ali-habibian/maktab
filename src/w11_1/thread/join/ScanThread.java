package w11_1.thread.join;

public class ScanThread implements Runnable{
    private Virus virus;

    public ScanThread(Virus virus) {
        this.virus = virus;
    }

    @Override
    public void run() {
        System.out.println("Start scanning...");
        for (int i = 0; i < 50_000; i++) {
            virus.increment();
        }
        virus.done();
        synchronized (virus){
            virus.notifyAll();
        }
        System.out.println("Scanning done!");

    }
}
