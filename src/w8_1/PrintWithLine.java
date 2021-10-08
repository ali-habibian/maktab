package w8_1;

public class PrintWithLine implements Print{
    @Override
    public void print(String... args) {
        for (String arg : args) {
            System.out.println("--------------------");
            System.out.println(arg);
        }
    }
}
