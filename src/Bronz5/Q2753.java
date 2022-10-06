package Bronz5;

//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(); //연도 입력

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
            System.out.println("1");
        }
        else{ //윤년이 아닐때
            System.out.println("0");
        }
    }
}
