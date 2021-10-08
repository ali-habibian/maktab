package w8_1;

public class PrintWithoutLine implements Print{
    @Override
    public void print(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
