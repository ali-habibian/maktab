package w13_1.decoratorPattern.component;

public class FileDataSource implements DataSource{
    @Override
    public void write(String data) {
        // Opening file and writing in it.
    }

    @Override
    public String read() {
        // Opening file and reading it.
        return "Ali";
    }
}
