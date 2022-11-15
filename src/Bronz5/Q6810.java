package Bronz5;

import java.util.Scanner;

public class Q6810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("9780921418");
        sb.append(scanner.next());
        sb.append(scanner.next());
        sb.append(scanner.next());
        String num = String.valueOf(sb);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                sum += num.charAt(i) - '0';
            } else {
                sum += (num.charAt(i) - '0') * 3;
            }
        }
        System.out.println("The 1-3-sum is " + sum);
    }
}
