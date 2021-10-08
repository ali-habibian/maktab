package w9_2;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ali", 20);
        map.put("Arash", 50);
        map.put("Arash", 30);
        map.putIfAbsent("Ali", 15); // agar Ali vojud dashte bashad megdarash ra avaz nemikonad

        System.out.println(map.get("Ali"));
        System.out.println(map.get("Arash"));
        System.out.println(map.containsKey("Ali"));
        System.out.println(map.containsValue(20));

//        Map.Entry<String, Integer> mp ==> var mp
        for (var mp : map.entrySet()) {
            System.out.println(mp.getKey() + " => " + mp.getValue());
        }

        Set<String> stringSet = map.keySet();
        Collection<Integer> integerList = map.values();

        countWord("aakguupdllsmssm");
    }

    public static void countWord(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (var ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
