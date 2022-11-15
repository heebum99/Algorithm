package Bronz5;

//a * x = b - c 방정식에서 a,b,c를 입력받았을때 a의 값 출력

import java.math.BigInteger;
import java.util.Scanner;

public class Q24309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger C = scanner.nextBigInteger();
        System.out.println(((B.subtract(C)).divide(A)));

    }
}
