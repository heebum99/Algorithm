import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next(); //영어 대소문자 상관없이 입력받음.

        char[] changeReverse = new char[101];

        if (word.length() <= 100) { //toCharArray => 문자열을 문자로 변환하는 메소드
            changeReverse = word.toCharArray();
        }

        for (int i = 0; i < changeReverse.length; i++) {
            if (changeReverse[i] >= 65 && changeReverse[i] <= 90) { //대문자라면 소문자로 변환
                changeReverse[i] += 32;
            } else if (changeReverse[i] >= 97 && changeReverse[i] <= 122) { //소문자라면 대문자로 변환
                changeReverse[i] -= 32;
            }
        }

        for(int i=0; i<changeReverse.length; i++){
            System.out.print(changeReverse[i]);
        }
    }
}