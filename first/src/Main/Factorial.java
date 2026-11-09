import java.math.BigInteger;

public class factorial {
    public static long factorialLong(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialLong(n - 1);
    }
    public static BigInteger factorialBig(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }
}
