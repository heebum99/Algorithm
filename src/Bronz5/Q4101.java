package Bronz5;

//�� ���� ������ �־����� ��, ù ��° ���� �� ��° ������ ū�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� ������ �־�����.
// �� ���� �鸸���� �۰ų� ���� ���� �����̴�. �Է��� ������ �ٿ��� 0�� �� �� �־�����.
//�� �׽�Ʈ ���̽�����, ù ��° ���� �� ��° ������ ũ�� Yes��, �ƴϸ� No�� �� �ٿ� �ϳ��� ����Ѵ�.

import java.math.BigInteger;
import java.util.Scanner;

public class Q4101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger f_num;
        BigInteger s_num;

        do { //do~while ������ �ּ� �ѹ� �̻� �Է¹ް� �Ѵ�.
            f_num = scanner.nextBigInteger();
            s_num = scanner.nextBigInteger();

            if(f_num.toString().equals("0")&&s_num.toString().equals("0")){ //ó������ 0, 0�� �Էµ� ���
                System.exit(0);
            }

            if(f_num.compareTo(s_num) == 1){ //���� ������ ũ�� 1, ������ 0 ������� -1�� ��ȯ
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        } while(!(f_num.toString().equals("0")&&s_num.toString().equals("0"))); //�Ѵ� 0�� �ԷµǱ� ������ ��� �Է¹޴´�.

    }
}
