package Bronz5;

import java.math.BigInteger;
import java.util.Scanner;

public class Q22193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //A의 자릿수
        int M = scanner.nextInt(); //B의 자릿수

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        System.out.println(A.multiply(B));
    }
}
