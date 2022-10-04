package Bronz5;

//ù° �ٿ� ����� ũ�� N �� M�� �־�����. ��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ���ʴ�� �־�����. �̾ N���� �ٿ� ��� B�� ���� M���� ���ʴ�� �־�����.
// N�� M�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.

import java.util.Scanner;

public class Q2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //���� ũ��
        int M = scanner.nextInt(); //���� ũ��

        int [][] ary1 = new int[N][M];
        int [][] ary2 = new int[N][M];
        int [][] sum = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ary1[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ary2[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sum[i][j] = ary1[i][j] + ary2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
