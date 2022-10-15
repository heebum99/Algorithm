package Bronz5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q13277 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.multiply(B));
    }
}
