package Bronz5;

//첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
// N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

import java.util.Scanner;

public class Q2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //행의 크기
        int M = scanner.nextInt(); //열의 크기

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
