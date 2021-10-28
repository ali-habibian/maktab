package w13_1.decoratorPattern;

import w13_1.decoratorPattern.component.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(encrypt(data));
    }

    @Override
    public String read() {
        return decrypt(super.read());
    }

    public String encrypt(String data) {
        // Encrypt the string
        return data; // Suppose data has been encrypted
    }

    public String decrypt(String data) {
        // Decrypt the string
        return data; // Suppose data has been decrypted
    }
}
