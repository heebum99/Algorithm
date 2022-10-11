package Bronz5;

//Byteland Airlines recently extended their aircraft fleet with a new model of a plane. 4
// The new acquisition has n1 rows of seats in the business class and n2 rows in the economic class.
// In the business class each row contains k1 seats, while each row in the economic class has k2 seats.

import java.util.Scanner;

public class Q8370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(); //비지니스석 열 개수
        int k1 = scanner.nextInt(); //비지니스석 열당 좌석 수
        int n2 = scanner.nextInt(); //이코노미석 열 개수
        int k2 = scanner.nextInt(); //이코노미석 열당 좌석 수

        System.out.println(n1 * k1 + n2 * k2);
    }
}
