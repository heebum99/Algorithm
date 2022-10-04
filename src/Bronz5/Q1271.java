package Bronz5;

//(1 ≤ m ≤ n ≤ 10^1000, m과 n은 10진수 정수)
//java.math패키지 안에 있는 BigInteger 사용

import java.util.Scanner;
import java.math.BigInteger;

public class Q1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger(); //백준 조교가 가진 돈
        BigInteger m = scanner.nextBigInteger(); //돈을 받으러 온 생명체의 수

        System.out.println(n.divide(m)); //divide() => 나누기연산
        System.out.println(n.remainder(m)); //remainder() => 나머지연산
    }
}
