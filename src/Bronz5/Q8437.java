package Bronz5;

//���� Julka�� ���� ���������� Ǯ�鼭 ��ġ�� ���縦 ���� �߽��ϴ�. Klaudia�� Natalia�� �Բ� ��� 10���� ������ ������ Klaudia�� Natalia���� 2�� �� ���� ����� ������ �ֽ��ϴ�.
// �ҳ���� ���� �� ���� ����� ������ �ֽ��ϱ�?
//Julka�� ������ ���� ����߽��ϴ�. Klaudia�� 6���� ����� ������ �ְ� Natalia�� 4���� ����� ������ �ֽ��ϴ�.
// Ʃ�ʹ� Julka�� ���� ��������� ������ Ȯ���ϱ�� �����ϰ� ������ ��� ������ �ø� ������ ���������� �ݺ��߽��ϴ�.
// Julka�� �׻� �ùٸ��� ����߽��ϴ�. ��� �������� Julka�� '����'�� ����ϰ� �;����� �ʹ� ���� ���ڷ� ���� ������ ������ ���� Ǯ �� �������ϴ�.
// ��ġ�� ���縦 ���� �ذ�å�� �����ϴ� ���α׷��� �ۼ��Ͻʽÿ�. ������ ���� ���α׷��� �ۼ��Ͻʽÿ�.
// �� �ҳడ �Բ� ������ �ִ� ��� ���� Klaudia�� ������ �ִ� ��� ���� �н��ϴ�.

// Klaudia�� ��� ���� Natalia�� ��� ���� ����մϴ�.
//ù ��° ���� �ҳ���� ������ ��� ����� ���� �����ϰ� �� ��° ���� Klaudia�� ������ �ִ� ����� ���� ��Ÿ���ϴ�. �� ���� ��� ������ ����Դϴ�.
// �ҳ���� �� 10^100�� ������ ����� ������ �ִ� ������ �˷��� �ֽ��ϴ�. ���ôٽ��� ����� �ſ� ���� �� �ֽ��ϴ�.


import java.math.BigInteger;
import java.util.Scanner;

public class Q8437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger total_apple = scanner.nextBigInteger(); //��� �� ����
        BigInteger current_kla_apple = scanner.nextBigInteger(); // klaudia�� ������ �ִ� ��� ��

        BigInteger kla_apple;
        BigInteger nat_apple;

        BigInteger total = total_apple.subtract(current_kla_apple); //�� ��� �������� klaudia�� �������ִ� ������ �� ����

        kla_apple = total.divide(BigInteger.valueOf(2)).add(current_kla_apple);
        nat_apple = total.divide(BigInteger.valueOf(2));
        System.out.println(kla_apple);
        System.out.println(nat_apple);

    }
}
