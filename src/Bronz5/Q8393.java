package Bronz5;

//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = n; i > 0; i--) {
            sum += i;
        }

        System.out.println(sum);
    }
}
