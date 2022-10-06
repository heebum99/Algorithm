package Bronz5;

//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correct_chess = {1,1,2,2,2,8}; //맞는 체스말의 개수, 킹 퀸 룩 비숍 나이트 폰 순서
        int[] input_chess = new int[6]; //찾은 체스말의 개수

        for (int i = 0; i < input_chess.length; i++) {
            input_chess[i] = scanner.nextInt();
        }

        for (int i = 0; i < input_chess.length; i++) {
            if (input_chess[i] >= 0 && input_chess[i] <= 10) {
                System.out.print(correct_chess[i] - input_chess[i]+" ");
            }
        }
    }
}
