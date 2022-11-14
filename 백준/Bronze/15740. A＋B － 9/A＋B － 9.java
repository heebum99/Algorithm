import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger num2 = scanner.nextBigInteger();
        System.out.println(num1.add(num2));
    }
}