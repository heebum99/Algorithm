package Bronz5;

//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q11654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        char input = word.charAt(0);

        System.out.println((int)input);

    }
}
