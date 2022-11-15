package Bronz5;

import java.util.Scanner;

public class Q21300 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beer = scanner.nextInt();
        int malt = scanner.nextInt();
        int wine = scanner.nextInt();
        int softDrink = scanner.nextInt();
        int seltzer = scanner.nextInt();
        int water = scanner.nextInt();

        System.out.println(5*(beer+malt+wine+softDrink+seltzer+water));
    }
}
