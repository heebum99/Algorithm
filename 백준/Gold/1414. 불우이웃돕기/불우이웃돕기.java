import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;
    static int N, sum;
    static PriorityQueue<Edge> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < N; j++) {
                int temp = 0;
                if (tmp.charAt(j) >= 'a' && tmp.charAt(j) <= 'z') {
                    temp = tmp.charAt(j) - 'a' + 1;
                } else if (tmp.charAt(j) >= 'A' && tmp.charAt(j) <= 'Z') {
                    temp = tmp.charAt(j) - 'A' + 27;
                }
                sum += temp; //랜선 길이 총합
                if (i != j && temp != 0) {
                    queue.add(new Edge(i, j, temp));
                }
            }
        }

        parent = new int[N];
        for (int i = 0; i < N; i++) { //유니온 파인드 구현을 위한 부모노드 초기화
            parent[i] = i;
        }

        //최소 신장 트리 알고리즘
        int cnt = 0;
        int result = 0;
        while (!queue.isEmpty()) {
            Edge now = queue.poll();
            if (find(now.s) != find(now.e)) { //부모 노드가 서로 같지 않으면 연결
                union(now.s, now.e);
                result += now.v;
                cnt++;
            }
        }

        if (cnt == N - 1) {
            System.out.println(sum - result); // 사용한 에지 개수가 노드개수 -1이면 랜선 총합 - 최소 신장 트리 결과값 = 기부할 수 있는 랜선 최대 길이
        } else {
            System.out.println(-1);
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    private static int find(int e) {
        if (e == parent[e]) {
            return e;
        }

        return parent[e] = find(parent[e]);
    }

    private static class Edge implements Comparable<Edge> {
        int s, e, v;

        public Edge(int s, int e, int v) {
            this.s = s;
            this.e = e;
            this.v = v;
        }

        @Override
        public int compareTo(Edge o) {
            return this.v - o.v;
        }
    }
}
