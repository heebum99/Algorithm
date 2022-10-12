package Bronz5;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.math.BigInteger;
import java.util.Scanner;

public class Q10757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.add(B));
    }
}
