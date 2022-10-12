package Bronz5;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); //계산 횟수
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A+B);
        }
    }
}
