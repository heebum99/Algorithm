package Bronz5;

//0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //N!�� ���ϱ� ���� ���� �Է�
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
