package Bronz5;

import java.util.Scanner;

public class Q20254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ur = scanner.nextInt(), tr = scanner.nextInt(), uo = scanner.nextInt(), to = scanner.nextInt();
        ur*=56;
        tr*=24;
        uo*=14;
        to*=6;

        System.out.println(ur+tr+uo+to);
    }
}
