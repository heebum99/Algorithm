package Bronz5;

//���ڿ��� �Է¹ް� ����� ����ϱ�

import java.util.Scanner;

public class Q8545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next(); //���ڿ� �Է�
        char[] reverse_input = new char[100];

        for (int i = 0; i < input.length(); i++) {
            reverse_input[input.length()-1-i] = input.charAt(i);
        }

        for(int i=0; i<input.length(); i++){
            System.out.print(reverse_input[i]);
        }
    }
}
