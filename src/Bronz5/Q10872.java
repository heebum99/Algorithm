package Bronz5;

//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //N!을 구하기 위해 정수 입력
        int result = 1;

        for (int i = N; i >= 1; i--) {
            result *= i;
        }

        if(N==0){
            result = 1;
        }

        System.out.println(result);
    }
}
