import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][N + 1]; //배열 크기가 [N+1][K+1]이 아닌 [N+1][N+1]로, 헷갈리지 말자
        for (int i = 0; i <= N; i++) { //조합 배열 초기화
            dp[i][0] = 1;
            dp[i][1] = i;
            dp[i][i] = 1;
        }

        //조합 점화식 dp[i][j] = dp[i-1][j] + dp[i-1][j-1]
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                //j==i인 경우는 위에서 초기화를 했기에 따로 진행x
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }
        System.out.println(dp[N][K]);
    }
}