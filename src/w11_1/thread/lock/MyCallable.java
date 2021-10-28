package w11_1.thread.lock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<List<List<Boolean>>> {
    private MessageEntity message1,message2,message3,message4;
    List<List<Boolean>> list = new ArrayList<>();

    public MyCallable(MessageEntity message1, MessageEntity message2, MessageEntity message3, MessageEntity message4) {
        this.message1 = message1;
        this.message2 = message2;
        this.message3 = message3;
        this.message4 = message4;

        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                List<Boolean> booleans = LockUtil.putAllAndCheck("1", Arrays.asList(message1, message2, message3, message4));

                    if (booleans.contains(false)){
                        Thread.sleep(1000);
                        booleans = LockUtil.putAllAndCheck("1", Arrays.asList(message1, message2, message3, message4));
                    }

                list.add(booleans);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<List<Boolean>> call() throws Exception {
        return list;
    }
}
