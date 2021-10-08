package w8_1;

public interface A {
    public static final String s = "ali";

    public abstract void f();
    void g();

    default void h(){
        System.out.println("h");
    }

    static void j(){
        System.out.println("static method");
    }

}
