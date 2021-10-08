package haltamrin.polymorohism;

import java.util.Scanner;

public class Square extends Shape{

    @Override
    public void printArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = in.nextInt();
        System.out.println("Square area is: " + width * width);
    }
}
