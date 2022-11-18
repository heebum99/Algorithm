package Bronze4;

//첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
//둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 10^6보다 작은 양의 정수 5개가 주어진다.

import java.util.Scanner;

public class Q2845 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt(); //1m^2 당 사람 수
        int P = scanner.nextInt(); //파티장 넓이
        int participants[] = new int[5]; //참가자 수

        for (int i = 0; i < participants.length; i++) {
            participants[i] = scanner.nextInt();
        }

        for (int i = 0; i < participants.length; i++) {
            System.out.print(participants[i] - L * P + " ");
        }
    }
}
