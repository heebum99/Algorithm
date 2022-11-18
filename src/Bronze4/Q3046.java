package Bronze4;

//두 숫자 R1과 R2가 있을 때, 두 수의 평균 S는 (R1+R2)/2와 같다
//첫째 줄에 두 정수 R1과 S가 주어진다
//R2출력

import java.util.Scanner;

public class Q3046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int S = scanner.nextInt();
        int R2 = S * 2 - R1;

        System.out.println(R2);
    }
}
