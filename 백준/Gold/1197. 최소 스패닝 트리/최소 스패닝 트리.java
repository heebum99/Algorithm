import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;
    static PriorityQueue<Edge> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //최소 신장 트리 알고리즘
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        queue = new PriorityQueue<>();
        parent = new int[V + 1];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            queue.offer(new Edge(s, e, v));
        }

        int cnt = 0;
        int result = 0;
        while (cnt < V - 1) {
            Edge now = queue.poll();
            if (find(now.start) != find(now.end)) {
                union(now.start, now.end);
                result += now.value;
                cnt++;
            }
        }
        System.out.println(result);
    }

    private static void union(int a, int b) { //대표 노드 연결
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    private static int find(int a) { //부모 노드 찾기
        if (a == parent[a]) {
            return a;
        }

        return find(parent[a] = find(parent[a]));
    }

    private static class Edge implements Comparable<Edge> {
        int start, end, value;

        public Edge(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }

        @Override
        public int compareTo(Edge o) { //가중치 기준으로 오름차순 정렬
            return this.value - o.value;
        }
    }
}
