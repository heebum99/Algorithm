package Bronz5;

//(1 �� m �� n �� 10^1000, m�� n�� 10���� ����)
//java.math��Ű�� �ȿ� �ִ� BigInteger ���

import java.util.Scanner;
import java.math.BigInteger;

public class Q1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger(); //���� ������ ���� ��
        BigInteger m = scanner.nextBigInteger(); //���� ������ �� ����ü�� ��

        System.out.println(n.divide(m)); //divide() => �����⿬��
        System.out.println(n.remainder(m)); //remainder() => ����������
    }
}
