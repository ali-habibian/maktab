package w11_1.thread.join;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*List<Thread> threadList = new ArrayList<>();
//        List<Virus> virusList = new ArrayList<>();
        Virus virus = new Virus();
        for (int i = 0; i < 5; i++) {

            Thread scan = new Thread(new ScanThread(virus));
            threadList.add(scan);

            scan.start();
        }

        Thread checkUrl = new Thread(new CheckUrlThread());
        checkUrl.start();

        try {
            for (var s : threadList) {
                s.join();
            }
            checkUrl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        int sum = 0;
//        for (var virus : virusList) {
//            sum += virus.getCount();
//        }

        System.out.println("Downloading..." + virus.getCount());*/

        Virus virus = new Virus();
        Thread t1 = new Thread(new ScanThread(virus));
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!virus.isDone()){
                    synchronized (virus){
                        try {
                            virus.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println(virus.getCount());
            }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
