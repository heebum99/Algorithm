package Bronz5;

//N������ ������ �׷�� �ֽ��� S���� �ֽ��� �����Ҷ� �� ������ ����ϴ� �ֽ��� ����(x�� ����)
//x�� �ִ밪��?

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
