import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] tree;
    static int N, M;
    static int[] depth;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine()); //노드 수

        tree = new ArrayList[N + 1]; //인접 리스트 배열 생성
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) { //인접 리스트에 그래프 데이터 저장
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            tree[s].add(e);
            tree[e].add(s);
        }

        depth = new int[N + 1]; //깊이 저장 배열
        parent = new int[N + 1]; //부모 저장 배열
        visited = new boolean[N + 1]; //방문 배열
        BFS(1);

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            //공통 조상을 구할 노드 2개
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int LCA = excuteLCA(a, b);
            System.out.println(LCA);
        }
    }

    private static int excuteLCA(int a, int b) {
        if (depth[a] < depth[b]) { //a 노드를 기준으로 진행 => b 노드의 깊이가 더 깊다면 swap 진행
            int temp = a;
            a = b;
            b = temp;
        }

        while (depth[a] != depth[b]) { //a 노드의 깊이가 더 깊을 때 => a 노드 부모 노드로 이동시켜 양쪽 깊이를 맞추기
            a = parent[a];
        }

        while (a != b) { //같은 조상이 나올때까지 진행
            a = parent[a];
            b = parent[b];
        }

        return a;
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        int height = 1;
        int nowSize = 1;
        int cnt = 0;
        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            for (int next : tree[nowNode]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    parent[next] = nowNode; //부모 노드 저장
                    depth[next] = height; //깊이 저장
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
