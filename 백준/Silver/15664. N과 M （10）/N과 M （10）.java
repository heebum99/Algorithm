import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr, num;
    static StringBuilder sb;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        num = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        DFS(1, 0);
        System.out.print(sb);
    }

    private static void DFS(int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0; //수열 값이 중복처리 되지않게 하기위함

        for (int i = at - 1; i < N; i++) {
            if (!visited[i]) {
                if (before != num[i]) {
                    visited[i] = true;
                    arr[depth] = num[i];
                    before = num[i];
                    DFS(i + 1, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
