package w13_1.decoratorPattern;

import w13_1.decoratorPattern.component.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(compression(data));
    }

    @Override
    public String read() {
        return decompression(super.read());
    }

    public String compression(String data) {
        // compression the string
        return data; // Suppose data has been compression
    }

    public String decompression(String data) {
        // decompression the string
        return data; // Suppose data has been decompression
    }
}
