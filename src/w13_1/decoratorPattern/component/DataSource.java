package w13_1.decoratorPattern.component;

public interface DataSource {
    void write(String data);
    String read();
}
