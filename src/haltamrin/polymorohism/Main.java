package haltamrin.polymorohism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        Shape shape;
//
//        if (in.nextInt() > 2){
//            shape = new Rectangle();
//        }else{
//            shape = new Square();
//        }
//
//        shape.printArea();

        int val = 290;
        System.out.println("Integer: "+val);
        String formattedStr = String.format("%07d", val);
        System.out.println("With leading zeros = " + formattedStr);
    }
}
