package Bronz5;

//���� �����̴� ���� A + B ������ ���� ����� �� �ִ�. ���� A + B + C�� ����� �����̴�

import java.math.BigInteger;
import java.util.Scanner;

public class Q11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger C = scanner.nextBigInteger();

        System.out.println(A.add(B.add(C)));
    }
}
