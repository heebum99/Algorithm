package Bronze4;

//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice[] = new int[3];
        int price = 0;

        for (int i = 0; i < dice.length; i++) {
            dice[i] = scanner.nextInt();
        }

        if (dice[0] == dice[1] && dice[0] == dice[2]) { //주사위 눈의 수가 다 같을 때
            price = 10000 + dice[0] * 1000;
            System.out.println(price);
        } else if (dice[0] == dice[1] || dice[0] == dice[2]) { //주사위 눈의 수가 2개만 같을 때
            price = 1000 + dice[0] * 100;
            System.out.println(price);
        } else if (dice[1] == dice[2]) {
            price = 1000 + dice[2] * 100;
            System.out.println(price);
        } else {
            price = Math.max(Math.max(dice[0], dice[1]), dice[2]) * 100;
            System.out.println(price);
        }
    }
}
