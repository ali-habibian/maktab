package w9_1;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.addFirst(3);
        linkedList.addLast(0);
        linkedList.add(6);

        for (var num : linkedList){
            System.out.println(num);
        }

        Object[] objects1 = linkedList.toArray();
        String[] strings = linkedList.toArray(new String[0]);
        Integer[] integers = linkedList.toArray(new Integer[0]);
    }
}
