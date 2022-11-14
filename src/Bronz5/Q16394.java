package Bronz5;

//홍익대학교는 1946년에 개교하였다.
//특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.

import java.util.Scanner;

public class Q16394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int hong = 1946;

        System.out.println(N-hong);
    }
}
