package Bronz5;

import java.util.Scanner;

public class Q14581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fan[] = new String[9];
        for (int i = 0; i < fan.length; i++) {
            fan[i] = "fan";
        }
        fan[4] = scanner.next();
        int cnt = 1;
        for (int i = 0; i < fan.length; i++) {
            System.out.print(":" + fan[i] + ":");
            if (cnt % 3 == 0) {
                System.out.println();
            }
            cnt++;
        }
    }
}
