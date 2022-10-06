package Bronz5;

//� ����� C��� ������ �־����� ��, ������ �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*      A+: 4.3, A0: 4.0, A-: 3.7

        B+: 3.3, B0: 3.0, B-: 2.7

        C+: 2.3, C0: 2.0, C-: 1.7

        D+: 1.3, D0: 1.0, D-: 0.7

        F: 0.0*/

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next(); //A+~F���� �Է¹޴� ����
        double score = 0; //����� ������ ��ȯ�ؼ� �����ϴ� ����

        char grade_1 = grade.charAt(0); //A~F�� ���ĺ��� �Է¹޴� ����

        if(grade_1 == 'F'){
            score = 0;
            System.out.println(score);
            System.exit(0);
        }


        char grade_2 = grade.charAt(1); //+,0,-���� �Է¹޴� ����

        switch (grade_1) {
            case 'A':
                score += 4;
                break;
            case 'B':
                score += 3;
                break;
            case 'C':
                score += 2;
                break;
            case 'D':
                score += 1;
                break;
            default:
                System.exit(0);
        }

        switch (grade_2){
            case '+':
                score+=0.3;
                break;
            case '0':
                score+=0;
                break;
            case '-':
                score-=0.3;
                break;
            default:
        }

        System.out.println(score);
    }
}
