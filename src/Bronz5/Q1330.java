package Bronz5;

//-10,000 �� A, B �� 10,000

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
