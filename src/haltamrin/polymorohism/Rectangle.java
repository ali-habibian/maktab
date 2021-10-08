package haltamrin.polymorohism;

import java.util.Scanner;

public class Rectangle extends Shape{

    @Override
    public void printArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width, height: ");
        int width = in.nextInt();
        int height = in.nextInt();
        System.out.println("Rectangle area is: " + width * height);
    }
}
