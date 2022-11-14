package Bronz5;

//성우는 민건이를 찾기 위해 떠난다. 성우는 1분에 1에서 5까지의 거리를 이동할 수 있다.
//성우가 있는 곳으로부터 민건이의 집까지 거리가 주어졌을 때, 최대한 빨리 찾을 경우, 정확히 몇 분만에 민건이를 찾을 수 있는지 출력하는 프로그램을 작성하시오.
//첫째 줄에 성우의 현재 위치와 민건이의 집까지의 거리 L(1 ≤ L ≤ 1,000,000)가 주어진다.

import java.util.Scanner;

public class Q15727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt(); //성우의 위치와 집까지의 거리
        double sung = 5; //성우가 1분에 갈 수 있는 최대 거리
        double result = L/sung;

        System.out.println((int)Math.ceil(result));

    }
}
