package Bronz5;

//어제 Julka는 다음 수수께끼를 풀면서 유치원 교사를 놀라게 했습니다. Klaudia와 Natalia는 함께 사과 10개를 가지고 있지만 Klaudia는 Natalia보다 2개 더 많은 사과를 가지고 있습니다.
// 소녀들은 각각 몇 개의 사과를 가지고 있습니까?
//Julka는 망설임 없이 대답했습니다. Klaudia는 6개의 사과를 가지고 있고 Natalia는 4개의 사과를 가지고 있습니다.
// 튜터는 Julka의 답이 우발적이지 않은지 확인하기로 결정하고 과제의 사과 개수를 늘릴 때마다 수수께끼를 반복했습니다.
// Julka는 항상 올바르게 대답했습니다. 놀란 선생님은 Julka의 '연구'를 계속하고 싶었지만 너무 많은 숫자로 인해 스스로 퍼즐을 빨리 풀 수 없었습니다.
// 유치원 교사를 돕고 해결책을 제안하는 프로그램을 작성하십시오. 다음과 같은 프로그램을 작성하십시오.
// 두 소녀가 함께 가지고 있는 사과 수와 Klaudia가 가지고 있는 사과 수를 읽습니다.

// Klaudia의 사과 수와 Natalia의 사과 수를 계산합니다.
//첫 번째 줄은 소녀들이 소유한 모든 사과의 수를 포함하고 두 번째 줄은 Klaudia가 가지고 있는 사과의 수를 나타냅니다. 두 숫자 모두 정수와 양수입니다.
// 소녀들은 총 10^100개 이하의 사과를 가지고 있는 것으로 알려져 있습니다. 보시다시피 사과는 매우 작을 수 있습니다.


import java.math.BigInteger;
import java.util.Scanner;

public class Q8437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger total_apple = scanner.nextBigInteger(); //사과 총 개수
        BigInteger current_kla_apple = scanner.nextBigInteger(); // klaudia가 가지고 있는 사과 수

        BigInteger kla_apple;
        BigInteger nat_apple;

        BigInteger total = total_apple.subtract(current_kla_apple); //총 사과 개수에서 klaudia가 가지고있는 개수를 뺀 갯수

        kla_apple = total.divide(BigInteger.valueOf(2)).add(current_kla_apple);
        nat_apple = total.divide(BigInteger.valueOf(2));
        System.out.println(kla_apple);
        System.out.println(nat_apple);

    }
}
