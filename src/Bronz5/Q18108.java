package Bronz5;

//불기연도를 서기연도로 바꾸기

import java.util.Scanner;

public class Q18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulgi_year = scanner.nextInt();
        int sugi_year = bulgi_year-543;
        System.out.println(sugi_year);
    }
}
