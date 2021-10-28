package w13_1.decoratorPattern;

import w13_1.decoratorPattern.component.DataSource;
import w13_1.decoratorPattern.component.FileDataSource;

public class Application {
    public static void main(String[] args) {
        DataSourceDecorator decoratorWithEncryptionAndCompression = new CompressionDecorator(new CompressionDecorator(new EncryptionDecorator(new FileDataSource())));
        DataSourceDecorator decoratorWithOnlyEncryption = new CompressionDecorator(new EncryptionDecorator(new FileDataSource()));
        DataSourceDecorator decoratorWithOnlyCompression = new CompressionDecorator(new CompressionDecorator(new FileDataSource()));
        DataSource normalDataSource = new FileDataSource();

        decoratorWithEncryptionAndCompression.write("ali");
        decoratorWithEncryptionAndCompression.read();

        decoratorWithOnlyEncryption.write("Ali");
        decoratorWithOnlyEncryption.read();

        decoratorWithOnlyCompression.write("ali");
        decoratorWithOnlyCompression.read();

        normalDataSource.write("Ali");
        normalDataSource.read();
    }
}
