package Bronz5;

//JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
//JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.

import java.util.Scanner;

public class Q5522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score, total_score = 0;

        for (int i = 0; i < 5; i++) {
            score = scanner.nextInt();
            total_score += score;
        }

        System.out.println(total_score);
    }
}
