package Bronz5;

//첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다

import java.util.Scanner;

public class Q2743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String word = scanner.next();
       int w_length = word.length();

       if(0<w_length && w_length<=100) {
           System.out.println(w_length);
       }
    }
}
