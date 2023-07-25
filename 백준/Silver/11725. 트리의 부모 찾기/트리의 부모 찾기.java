import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        tree = new ArrayList[N + 1];
        answer = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            tree[child].add(parent);
            tree[parent].add(child);
        }

        DFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for (int val : tree[i]) {
            if (!visited[val]) {
                answer[val] = i;
                DFS(val);
            }
        }
    }
}
