package Bronz5;

//ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�

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
