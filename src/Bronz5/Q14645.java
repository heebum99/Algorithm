package Bronz5;

//첫 줄에 출발역과 종착역을 제외한 정거장의 수 N(1 ≤ N ≤ 100,000)과 출발역에서 탑승하는 사람의 수 K(1 ≤ K ≤ 10,000)가 주어진다.
//둘째 줄부터 N개의 줄에 걸쳐 각 줄마다 i번째 정거장에서 탑승하는 인원 A와 하차하는 인원 B가 주어진다. (0 ≤ A, B ≤ 10,000)

import java.util.Scanner;

public class Q14645 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //정거장 수
        int K = scanner.nextInt(); //출발역에서 탑승하는 사람 수
        int total = K;

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt(); //i번째 정거장에서 탑승하는 사람 수
            total += A;
            int B = scanner.nextInt(); //i번째 정거장에서 하차하는 사람 수
            if (total >= B) {
                total -= B;
            }
        }
        String bus_driver = "비와이";
        System.out.println(bus_driver);
    }
}
