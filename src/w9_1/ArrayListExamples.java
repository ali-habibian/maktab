package w9_1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);

        for (var num : numbers) {
            System.out.println(num);
        }

        System.out.println();

        var strs = new ArrayList<>();
        strs.add("Ali1");
        strs.add("Ali8");
        strs.add("Ali6");

        for (var str : strs) {
            System.out.println(str);
        }

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        Object[] objects = strings.toArray();
        String[] strings1 = strings.toArray(new String[0]);
    }
}
