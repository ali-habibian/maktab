package w10_2.generices.c2;

public class Printer <T extends Number> implements PrintInterface<T>{

    @Override
    public void print(T param) {
        System.out.println(param.doubleValue());
    }
}
