import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr; //원본 값을 저장하는 배열
    static Integer[][] dp; //경로 최대값을 구하는 배열
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(find(0, 0));

        //메모리 초과 => 쓰레기 같은 코드.....
        /*int N = Integer.parseInt(br.readLine()); //삼각형 크기 = 높이 = 맨 밑면의 숫자 개수
        int[][] subTotal = new int[N][(int) Math.pow(2, N - 1)];
        int[][] triangle = new int[N][(int) Math.pow(2, N - 1)];

        for (int i = 0; i < N; i++) {
            Arrays.fill(subTotal[i], Integer.MIN_VALUE);
            Arrays.fill(triangle[i], Integer.MIN_VALUE);
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            while (st.hasMoreTokens()) {
                triangle[i][cnt++] = Integer.parseInt(st.nextToken());
            }
        }

        subTotal[0][0] = triangle[0][0];
        int max = 0;
        int pre_cnt = 1;
        for (int i = 1; i < N; i++) {
            pre_cnt *= 2;
            int cnt_1 = 0;
            int cnt_2 = 0;
            for (int j = 0; j < pre_cnt; j++) {
                if (j != 0 && j % 2 == 0) {
                    cnt_1++;
                }
                if (j % 2 == 1) {
                    cnt_2++;
                }
                subTotal[i][j] = subTotal[i - 1][cnt_1] + triangle[i][cnt_2];
                if (i == N - 1) {
                    if (max < subTotal[i][j]) {
                        max = subTotal[i][j];
                    }
                }
            }
        }
        System.out.println(max);*/
    }

    private static int find(int depth, int idx) {
        //마지막 행일 경우 현재 위치의 dp값 반환
        if (depth == N - 1) {
            return dp[depth][idx];
        }

        //탐색하지 않은 값인 경우 다음 행의 양쪽 값 비교
        if (dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
