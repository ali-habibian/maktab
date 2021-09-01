package w4;

public class OneDigit {
    public static void main(String[] args) {
        int number = 13574532;
        int result = sumOfDigits(number);

        while (result > 9) {
            result = sumOfDigits(number);
            number = result;
        }

        System.out.println(result);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
