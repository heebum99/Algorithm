package Bronz5;

import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B; //입력받을 두 정수

        while (scanner.hasNextInt()) { //더이상 정수를 입력하지 않는 경우 종료.(EOF개념)
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);
        }

    }
}
