package Bronz5;

//���� �ҹ��ڿ� �빮�ڷ� �̷���� �ܾ �Է¹��� ��, �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�.

import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next(); //���� ��ҹ��� ������� �Է¹���.

        char[] changeReverse = new char[101];

        if (word.length() <= 100) { //toCharArray => ���ڿ��� ���ڷ� ��ȯ�ϴ� �޼ҵ�
            changeReverse = word.toCharArray();
        }

        for (int i = 0; i < changeReverse.length; i++) {
            if (changeReverse[i] >= 65 && changeReverse[i] <= 90) { //�빮�ڶ�� �ҹ��ڷ� ��ȯ
                changeReverse[i] += 32;
            } else if (changeReverse[i] >= 97 && changeReverse[i] <= 122) { //�ҹ��ڶ�� �빮�ڷ� ��ȯ
                changeReverse[i] -= 32;
            }
        }

        for(int i=0; i<changeReverse.length; i++){
            System.out.print(changeReverse[i]);
        }
    }
}
