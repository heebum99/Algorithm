import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] tree;
    static int answer, delNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N];
        tree = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }

        int root = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent == -1) {
                root = i;
                continue;
            }
            tree[i].add(parent);
            tree[parent].add(i);
        }
        delNode = Integer.parseInt(br.readLine());
        answer = 0;

        if (delNode == root) {
            System.out.println(0);
        } else {
            DFS(root);
            System.out.println(answer);
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        int childCnt = 0;
        for (int val : tree[node]) {
            if (!visited[val] && val != delNode) {
                childCnt++;
                DFS(val);
            }
        }
        if (childCnt == 0) {
            answer++;
        }
    }
}
