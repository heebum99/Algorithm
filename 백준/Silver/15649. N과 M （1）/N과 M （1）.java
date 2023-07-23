import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int[M];

        //백트래킹으로 구현
        DFS(0);
        System.out.print(sb);
    }

    private static void DFS(int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true; //중복을 방지하기 위해 방문노드를 true로 초기화
                arr[depth] = i + 1;
                DFS(depth + 1); //자식 노드 호출
                visited[i] = false; //자식노드 호출 이후 다시 방문노드 false로 초기화
            }
        }
    }
}
