package Bronz5;

//�� ��ȸ�� (n+1)���� ����� �̷������. �̶�, ���帶���� �۾� ���� �ּ� 2ȸ, �ִ� 3ȸ�̴�.
//�Է¹��� ���� n ����� (n+1)���忡 ���� �ּ� �۾� �� / �ִ� �۾� �� �̴�.

import java.util.Scanner;

public class Q8871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //���� ��
        int max = (n+1)*3; //�ִ� �۾� ��
        int min = (n+1)*2; //�ּ� �۾� ��

        System.out.println(min + " " + max);
    }
}
