public class SumOfDigitsUntilSingle {
    public static int sumOfDigitsUntilSingle(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;  // Digital Root Formula
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsUntilSingle(9875));
        System.out.println(sumOfDigitsUntilSingle(12345));
        System.out.println(sumOfDigitsUntilSingle(9999));
    }
}
