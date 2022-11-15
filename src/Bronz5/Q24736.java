package Bronz5;

import java.util.Scanner;

public class Q24736 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            int T = scanner.nextInt();
            int F = scanner.nextInt();
            int S = scanner.nextInt();
            int P = scanner.nextInt();
            int C = scanner.nextInt();

            T *= 6;
            F *= 3;
            S *= 2;
            C *= 2;
            int total = T + F + S + P + C;
            System.out.print(total+" ");
        }
    }
}
