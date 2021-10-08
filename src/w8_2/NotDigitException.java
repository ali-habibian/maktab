package w8_2;

// Custom Exception
public class NotDigitException extends Exception{
    private String methodName;

    public NotDigitException() {
    }

    public NotDigitException(String message, String methodName) {
        super(message);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
