package Bronz5;

import java.util.Scanner;

public class Q11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); //입력받을 횟수
        int count = 0;

        while (count < T) {
            count++;

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println("Case #" + count + ": " + A + " + " + B + " = " + (A + B));
        }
    }
}
