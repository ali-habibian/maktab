package w11_2;

import java.util.concurrent.atomic.LongAdder;

public class Virus {
    private int count;
    private LongAdder adder = new LongAdder();
    private volatile boolean isDone = false;

    private final Object monitorCount = new Object();

    public void increment() {
        for (int i = 0; i < 10_000; i++) {
            adder.increment();
        }

    }

    public int getCount() {
        return adder.intValue();
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }
}
