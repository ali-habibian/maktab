package w10_2.generices.wildcards;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Parent> parentList = new List<>();
        List<Child> childList = new List<>();

    }

    private void print(List<? extends Parent> list){
        System.out.println(list.get(0));
    }

    private void add(List<? super Parent> list, Child child){
        list.add(child);
    }
}
