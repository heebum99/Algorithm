package Bronz5;

//ù° �ٿ� A��, ��° �ٿ� B�� �־�����. ������ ���� 10������ 1,000�ڸ��� ���� ������ ����� ������ ��� �־��� �� �ִ�.

import java.math.BigInteger;
import java.util.Scanner;

public class Q2338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
