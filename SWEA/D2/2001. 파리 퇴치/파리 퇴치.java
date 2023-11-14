import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int T = sc.nextInt();
        int N, M, sum, max;

        for (int i = 1; i <= T; i++) {
            max = -1;
            num++;
            N = sc.nextInt();
            M = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            for (int y1 = 0; y1 < N - M + 1; y1++) {
                for (int x1 = 0; x1 < N - M + 1; x1++) {
                    sum = 0;

                    for (int y2 = 0; y2 < M; y2++) {
                        for (int x2 = 0; x2 < M; x2++) {
                            sum += arr[y1 + y2][x1 + x2];
                        }
                    }

                    if (max < sum) {
                        max = sum;
                    }
                }
            }
            System.out.println("#" + num + " " + max);
        }

    }
}