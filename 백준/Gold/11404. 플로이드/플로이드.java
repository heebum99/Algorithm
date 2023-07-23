import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //도시 개수
        int M = Integer.parseInt(br.readLine()); //노선 개수

        arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) { //인접 행렬 초기화
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 10000001; //충분히 큰 수로 초기화
                }
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (arr[start][end] > cost) {
                arr[start][end] = cost;
            }
        }

        //플로이드 - 워셜 알고리즘
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 10000001) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
