package Bronz5;

import java.util.Arrays;
import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] student = new int[28]; //30���� �л�

        for (int i = 0; i < student.length; i++) {
            student[i] = scanner.nextInt();
        }

        Arrays.sort(student); //������������ student �迭�� ���� ����

        for (int i = 1; i <= 30; i++) {
            int count = 0;
            for (int j = 0; j < student.length; j++) {
                if (i == student[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(i);
            }
        }
    }
}
