import java.util.Scanner;

public class Main {
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
