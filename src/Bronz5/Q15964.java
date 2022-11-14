package Bronz5;

//연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
//정수 A, B가 주어지면 A＠B를 계산하는 프로그램을 만들어주자!

import java.math.BigInteger;
import java.util.Scanner;

public class Q15964 {
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
