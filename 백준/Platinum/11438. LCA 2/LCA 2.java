import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] depth;
    static int[][] parent;
    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            tree[s].add(e);
            tree[e].add(s);
        }

        depth = new int[N + 1];
        visited = new boolean[N + 1];
        int tmp = 1;
        max = 0; //트리의 최대 가능 높이
        while (tmp <= N) { //최대 가능 depth 구하기
            tmp <<= 1;
            max++;
        }

        parent = new int[max + 1][N + 1];
        BFS(1);
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= N; j++) {
                parent[i][j] = parent[i - 1][parent[i - 1][j]];
            }
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int LCA = excuteLCA(a, b);
            System.out.println(LCA);
        }
    }

    private static int excuteLCA(int a, int b) {
        if (depth[a] > depth[b]) { //b가 더 깊도록 swap을 통해 변경
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = max; i >= 0; i--) { //depth 빠르게 맞추기
            if (Math.pow(2, i) <= depth[b] - depth[a]) {
                if (depth[a] <= depth[parent[i][b]]) {
                    b = parent[i][b];
                }
            }
        }

        for (int i = max; i >= 0; i--) { //조상 빠르게 찾기
            if (parent[i][a] != parent[i][b]) {
                a = parent[i][a];
                b = parent[i][b];
            }
        }

        int LCA = a;
        if (a != b) {
            LCA = parent[0][LCA];
        }
        return LCA;
    }


    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        int nowSize = 1;
        int height = 1;
        int cnt = 0;
        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            for (int next : tree[nowNode]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    parent[0][next] = nowNode;
                    depth[next] = height;
                }
            }

            cnt++;
            if (cnt == nowSize) {
                cnt = 0;
                nowSize = queue.size();
                height++;
            }
        }
    }
}
