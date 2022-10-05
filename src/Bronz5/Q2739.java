package Bronz5;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N >= 1 && N <= 9) {
            for(int i=1; i<=9; i++){
                System.out.println(N+" * "+i+" = "+(N*i));
            }
        }
        scanner.close();
    }
}
