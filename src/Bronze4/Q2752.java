package Bronze4;

//숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

import java.util.Arrays;
import java.util.Scanner;

public class Q2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num); //오름차순 정렬

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
