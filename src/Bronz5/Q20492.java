package Bronz5;

import java.util.Scanner;

public class Q20492 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //전체상금

        //전체상금의 22%를 세금으로 내는경우
        System.out.print((int)(N * 0.78)+" ");

        //전체상금의 80%를 인정받고 나머지 금액중 22%를 세금으로 내는 경우 => x - x * 0.2 * 0.22
        System.out.println((int)(N - (N * 0.2 * 0.22)));
    }
}
