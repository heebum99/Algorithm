package Bronz5;

import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B; //�Է¹��� �� ����

        while (scanner.hasNextInt()) { //���̻� ������ �Է����� �ʴ� ��� ����.(EOF����)
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);
        }

    }
}
