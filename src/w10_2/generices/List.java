package w10_2.generices;

public class List<T>{
    private T[] array = (T[]) new Object[10];
    private int count;

    public void add(T t){
        array[count++] = t;
    }

    public T get(int index){
        return array[index];
    }
}
