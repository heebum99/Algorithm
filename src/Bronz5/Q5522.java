package Bronz5;

//JOI���� ī�� ������ �ϰ� �ִ�. �� ī�� ������ 5ȸ�� �������� ����Ǹ�, �� �������� �ºθ� �ϴ� �����̴�.
//JOI���� �� ������ ������ ��Ÿ���� ������ �־����� ��, JOI���� ������ ���ϴ� ���α׷��� �ۼ��϶�.

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
