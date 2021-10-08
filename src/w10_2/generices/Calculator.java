package w10_2.generices;

public class Calculator<T extends Number> {
    public <T extends Number> double add(T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }
}
