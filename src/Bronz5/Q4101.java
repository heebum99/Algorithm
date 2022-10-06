package Bronz5;

//두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
//입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수가 주어진다.
// 두 수는 백만보다 작거나 같은 양의 정수이다. 입력의 마지막 줄에는 0이 두 개 주어진다.
//각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.

import java.math.BigInteger;
import java.util.Scanner;

public class Q4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger f_num;
        BigInteger s_num;

        do { //do~while 루프로 최소 한번 이상 입력받게 한다.
            f_num = scanner.nextBigInteger();
            s_num = scanner.nextBigInteger();

            if(f_num.toString().equals("0")&&s_num.toString().equals("0")){ //처음부터 0, 0이 입력된 경우
                System.exit(0);
            }

            if(f_num.compareTo(s_num) == 1){ //인자 값보다 크면 1, 같으면 0 작은경우 -1을 반환
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        } while(!(f_num.toString().equals("0")&&s_num.toString().equals("0"))); //둘다 0이 입력되기 전까지 계속 입력받는다.

    }
}
