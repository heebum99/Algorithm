package Bronz5;

//어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
/*      A+: 4.3, A0: 4.0, A-: 3.7

        B+: 3.3, B0: 3.0, B-: 2.7

        C+: 2.3, C0: 2.0, C-: 1.7

        D+: 1.3, D0: 1.0, D-: 0.7

        F: 0.0*/

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next(); //A+~F까지 입력받는 변수
        double score = 0; //등급을 점수로 변환해서 저장하는 변수

        char grade_1 = grade.charAt(0); //A~F중 알파벳을 입력받는 변수

        if(grade_1 == 'F'){
            score = 0;
            System.out.println(score);
            System.exit(0);
        }


        char grade_2 = grade.charAt(1); //+,0,-인지 입력받는 변수

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
