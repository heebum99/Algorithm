package Bronz5;

//���� N���� �̷���� ���� A�� ���� X�� �־�����.
//�̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //�Է¹��� ���� ����
        int X = scanner.nextInt(); //X���� ���� �� ���ϱ�.

        int[] arr = new int[N]; //������ ��� �迭 

        for (int i = 0; i < arr.length; i++) { //������ ���� ���� �Է�
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<X){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
