package Bronze4;

import java.util.Scanner;

public class Q4589 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //입력받을 줄 개수
        int a, b, c;
        String[] results = new String[N];
        for (int i = 0; i < N; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a > b && a > c && b > c) {
                results[i] = "Ordered";
            } else if (a < b && a < c && b < c) {
                results[i] = "Ordered";
            } else {
                results[i] = "Unordered";
            }
        }
        System.out.println("Gnomes:");
        for (int i = 0; i < N; i++) {
            System.out.println(results[i]);
        }
    }
}
