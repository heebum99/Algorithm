package Bronz5;

//ù° �ٿ� �� ������ ���� (|N-M|)�� ����Ѵ�.

import java.util.Scanner;
import java.math.*;

public class Q2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //�� �������� ����
        BigInteger N = scanner.nextBigInteger();
        BigInteger M = scanner.nextBigInteger();

        if(N.compareTo(M)>0){
            System.out.println(N.subtract(M));
        }
        else{
            System.out.println(M.subtract(N));
        }
    }
}
