package Bronz5;

//이 대회는 (n+1)개의 라운드로 이루어진다. 이때, 라운드마다의 작업 수는 최소 2회, 최대 3회이다.
//입력받을 것은 n 출력은 (n+1)라운드에 대한 최소 작업 수 / 최대 작업 수 이다.

import java.util.Scanner;

public class Q8871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //라운드 수
        int max = (n+1)*3; //최대 작업 수
        int min = (n+1)*2; //최소 작업 수

        System.out.println(min + " " + max);
    }
}
