package w13_1.tamrin;

import w13_1.tamrin.creator.ArtDecoFactory;
import w13_1.tamrin.creator.Factory;
import w13_1.tamrin.creator.ModernFactory;
import w13_1.tamrin.creator.VictorianFactory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Factory factory;

        int option = new Scanner(System.in).nextInt();

        if (option == 0)
            factory = new ArtDecoFactory();
        else if (option == 1)
            factory = new ModernFactory();
        else
            factory = new VictorianFactory();

        factory.createCaffeTerria().coffeTeriaMethod();
        factory.createChair().chairMethode();
        factory.createSofa().sofaMethod();
    }
}
