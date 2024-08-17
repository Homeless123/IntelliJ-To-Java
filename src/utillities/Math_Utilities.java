package utillities;

public class Math_Utilities {
    // Math utilities
    public static int max(int... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int min(int... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
