package Bronz5;

//regular box => 8개, small box => 3개, 학생수 28명일때 남은 개수

import java.util.Scanner;

public class Q24568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int S = scanner.nextInt();
        R*=8;
        S*=3;
        int students = 28;
        System.out.println(R+S-students);
    }
}
