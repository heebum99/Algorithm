package Bronz5;

//���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //�Է� Ƚ��
        String [] input = new String[n]; //�Է¹��� ���ڿ� �迭
        String [] result = new String[n]; //ù��° ���ڿ� ������ ���ڸ� ����ִ� ���ڿ� ��� �迭

        for (int i = 0; i < n; i++) { //�Է¹��� ������ Ƚ����ŭ �Է��� ����.
            input[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) { //�Է¹��� ������ Ƚ����ŭ �Է��� ����.
            result[i] = ""+input[i].charAt(0) + input[i].charAt(input[i].length()-1);
            System.out.println(result[i]);
        }
    }
}
