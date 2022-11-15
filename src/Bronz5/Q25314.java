package Bronz5;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int long_count = (n - 4) / 4;
        for (int i = 0; i < long_count; i++) {
            System.out.print("long ");
        }
        System.out.print("long int");
    }
}
