package w11_1.thread.join;

import com.sun.source.tree.SynchronizedTree;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Virus {
    private int count;
    private volatile boolean isDone =false;
//    private boolean isDone =false;
//    private Lock lock = new ReentrantLock();
    private final Object monitorCount = new Object();

    /*public void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }*/

    public void increment() {
        synchronized (monitorCount){
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }
}
