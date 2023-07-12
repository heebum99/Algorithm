import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] set; //집합 처리
    static ArrayList<Integer>[] arr; //인접 리스트
    static boolean[] visited; //방문 여부 체크 배열
    static boolean check; //이분 그래프 여부 체크 배열

    public static void main(String[] args) throws IOException { //그래프 사이클 찾기 => DFS 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int nodeCnt = Integer.parseInt(st.nextToken());
            int edgeCnt = Integer.parseInt(st.nextToken());

            check = true;
            arr = new ArrayList[nodeCnt + 1];
            visited = new boolean[nodeCnt + 1];
            set = new int[nodeCnt + 1];

            for (int j = 1; j <= nodeCnt; j++) {
                arr[j] = new ArrayList<>();
            }

            for (int j = 0; j < edgeCnt; j++) { //방향성은 생각하지 않는다.
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                arr[start].add(end);
                arr[end].add(start);
            }

            for (int j = 1; j <= nodeCnt; j++) {
                if (check) {
                    DFS(j);
                } else {
                    break;
                }
            }

            if (!check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static void DFS(int i) { //DFS 알고리즘 구현
        visited[i] = true;

        for (int node : arr[i]) {
            if (!visited[node]) { //인접 노드는 같은 집합이면 안됨 => 다른 집합으로 처리
                set[node] = (set[i] + 1) % 2;
                DFS(node);
            } else if (set[node] == set[i]) { //이미 방문한 노드가 현재 노드와 같은 집합인 경우 => 이분 그래프 x
                check = false;
                return;
            }
        }
    }
}
