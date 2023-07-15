import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //도시 수
        int M = Integer.parseInt(br.readLine()); //여행 계획에 속한 도시 수

        //유니온 파인드 알고리즘을 사용하기 위한 초기화 작업
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        int[][] city = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] destination = new int[M + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= M; i++) {
            destination[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (city[i][j] == 1) {
                    union(i, j);
                }
            }
        }

        int result = find(destination[1]);
        for (int i = 2; i < destination.length; i++) {
            if (result != find(destination[i])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    private static void union(int n1, int n2) {
        n1 = find(n1);
        n2 = find(n2);
        if (n1 != n2) {
            parent[n2] = n1;
        }
    }

    private static int find(int n) { //부모 노드를 찾기 위해 재귀호출 진행
        if (parent[n] == n) {
            return n;
        }
        return parent[n] = find(parent[n]);
    }
}
