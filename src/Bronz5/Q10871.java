package Bronz5;

//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //입력받을 정수 개수
        int X = scanner.nextInt(); //X보다 작은 수 구하기.

        int[] arr = new int[N]; //수열을 담는 배열 

        for (int i = 0; i < arr.length; i++) { //수열에 각각 수를 입력
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<X){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
