package w11_1.thread.lock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MessageEntity twoA = new MessageEntity("2", "A");
        MessageEntity three = new MessageEntity("3", "B");
        MessageEntity four = new MessageEntity("4", "C");
        MessageEntity twoD = new MessageEntity("2", "D");
        MessageEntity three3 = new MessageEntity("3", "B");

        System.out.println(LockUtil.putAllAndCheck("1", Arrays.asList(twoA, three, four, twoD, three3)));
    }
}