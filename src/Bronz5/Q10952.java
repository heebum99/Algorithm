package Bronz5;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;
        do {
            A = scanner.nextInt();
            B = scanner.nextInt();

            if (A == 0 && B == 0) {
                System.exit(0);
            }

            System.out.println(A + B);
        } while (A != 0 && B != 0);
    }
}
