package Bronz5;

//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt(); //���� �Է�

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
            System.out.println("1");
        }
        else{ //������ �ƴҶ�
            System.out.println("0");
        }
    }
}
