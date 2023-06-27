import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<cNode>[] A;
    static long lcm;
    static boolean[] visited;
    static long[] D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //싸이클이 없는 트리 구조를 이용해 풀기
        int N = Integer.parseInt(br.readLine());
        A = new ArrayList[N];
        visited = new boolean[N];
        D = new long[N];
        lcm = 1;

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            A[a].add(new cNode(b, p, q));
            A[b].add(new cNode(a, q, p));
            lcm *= (p * q / gcd(p, q)); //유클리드 호제법을 이용한 최소 공배수
        }

        D[0] = lcm;
        DFS(0);
        long gcdNum = D[0];
        for (int i = 1; i < N; i++) {
            gcdNum = gcd(gcdNum, D[i]);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(D[i] / gcdNum + " ");
        }
    }

    private static void DFS(int i) {
        visited[i] = true;
        for (cNode cNode : A[i]) {
            int next = cNode.getB();
            if (!visited[next]) {
                D[next] = D[i] * cNode.getQ() / cNode.getP();
                DFS(next);
            }
        }
    }

    private static long gcd(long p, long q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    private static class cNode {
        int b;
        int p;
        int q;

        public cNode(int b, int p, int q) {
            this.b = b;
            this.p = p;
            this.q = q;
        }

        public int getB() {
            return b;
        }

        public int getP() {
            return p;
        }

        public int getQ() {
            return q;
        }
    }
}
