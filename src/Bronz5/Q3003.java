package Bronz5;

//ù° �ٿ� �����̰� ã�� ��� ŷ, ��, ��, ���, ����Ʈ, ���� ������ �־�����. �� ���� 0���� ũ�ų� ���� 10���� �۰ų� ���� �����̴�.

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correct_chess = {1,1,2,2,2,8}; //�´� ü������ ����, ŷ �� �� ��� ����Ʈ �� ����
        int[] input_chess = new int[6]; //ã�� ü������ ����

        for (int i = 0; i < input_chess.length; i++) {
            input_chess[i] = scanner.nextInt();
        }

        for (int i = 0; i < input_chess.length; i++) {
            if (input_chess[i] >= 0 && input_chess[i] <= 10) {
                System.out.print(correct_chess[i] - input_chess[i]+" ");
            }
        }
    }
}
