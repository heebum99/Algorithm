import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void calc(BigInteger A, BigInteger B) {
        System.out.println((A.add(B)).multiply(A.subtract(B)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        calc(A, B);
    }
}