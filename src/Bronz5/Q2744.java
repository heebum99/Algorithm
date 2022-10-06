package Bronz5;

//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

import java.util.Scanner;

public class Q2744 {
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
