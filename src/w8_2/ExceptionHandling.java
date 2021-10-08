package w8_2;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(convert("12f"));
        } catch (NotDigitException e) {
            System.out.println(e.getMethodName());
        } finally {
            System.out.println("finally block");
        }
    }

    public static int convert(String str) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                throw new NotDigitException("String is not digit", "convert method"); // Using custom exception
        }

        return Integer.parseInt(str);
    }

    public static double dive(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static double diveDouble(double x, double y) throws Exception {
        if (y == 0)
            throw new Exception("Bad Dive"); // Custom exception

        return x / y;
    }
}
