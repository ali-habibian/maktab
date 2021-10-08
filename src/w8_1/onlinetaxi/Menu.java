package w8_1.onlinetaxi;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void runMenu(){
        System.out.println("Enter source: ");
        int source = input.nextInt();

        System.out.println("Enter destination: ");
        int destination = input.nextInt();

        System.out.println("Enter trip type: ");
        String tripType = input.next();

        System.out.println("Is rainy: ");
        boolean isRainy = input.next().startsWith("y");

        System.out.println("Is peak time: ");
        boolean isPeakTime = input.next().startsWith("y");

        TripParam tripParam = new TripParam(source,destination, isPeakTime, isRainy);

        System.out.printf("Price is: %d",TripHandler.getInstance().calcPrice(tripType, tripParam));
    }
}
