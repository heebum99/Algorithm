package Bronz5;

//�� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //�Է¹��� ������ ����
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {//�Է¹��� ���� v�� ������ �Է¹��� �� �߿� ��� �ִ��� ���
            if(arr[i]==v){
                count++;
            }
        }

        System.out.println(count);
    }
}
