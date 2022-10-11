package Bronz5;

import java.util.Arrays;
import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] student = new int[28]; //30명의 학생

        for (int i = 0; i < student.length; i++) {
            student[i] = scanner.nextInt();
        }

        Arrays.sort(student); //오름차순으로 student 배열의 값을 정렬

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
