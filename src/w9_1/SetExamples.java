package w9_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("ab");
        set.add("bc");
        set.add("agh");
        set.add("fatyd12ss");
        set.add("jkllas");
        set.add("asd55ads");

        for (var num:set){
            System.out.println(num);
        }
        System.out.println();
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("b");
        treeSet.add("z");
        treeSet.add("a");

        for (var str:treeSet){
            System.out.println(str);
        }
        System.out.println();

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("z");
        linkedHashSet.add("a");
        linkedHashSet.add("t");

        for (var str:linkedHashSet){
            System.out.println(str);
        }
        System.out.println();
    }
}
