package Bronz5;

//N명으로 구성된 그룹과 주심은 S개의 주식을 공유할때 각 개인이 취득하는 주식의 개수(x는 정수)
//x의 최대값은?

import java.util.Scanner;

public class Q3733 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int S = scanner.nextInt();
            System.out.println(S/(N+1));
        }

    }
}
