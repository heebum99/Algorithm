package Bronz5;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //영수증 총 금액
        int n = scanner.nextInt(); //구매한 물건의 종류 수

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int price = scanner.nextInt();
            int num = scanner.nextInt();
            sum += price * num;
        }

        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
