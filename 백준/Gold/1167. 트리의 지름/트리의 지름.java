import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Edge>[] arr;
    static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<Edge>();
        }

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int node = Integer.parseInt(st.nextToken()); //기준 노드

            while (true) {
                int next_node = Integer.parseInt(st.nextToken()); //인접한 노드
                if (next_node == -1) {
                    break;
                }
                int v = Integer.parseInt(st.nextToken()); //인접노드와의 거리
                arr[node].add(new Edge(next_node, v));
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(1); //처음 시작점은 아무 노드나 잡고 시작
        int Max = 1;

        for (int i = 2; i <= N; i++) {
            if (distance[Max] < distance[i]) { //distance 배열에서 가장 큰값으로 다시 시작점을 설정
                Max = i;
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    private static void BFS(int node) { //BFS 구현
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (Edge i : arr[now_node]) {
                int next_node = i.next_node;
                int v = i.v;
                if (!visited[next_node]) {
                    visited[next_node] = true;
                    queue.add(next_node);
                    distance[next_node] = distance[now_node] + v;
                }
            }
        }
    }

    private static class Edge { //노드의 정보를 담는 클래스
        int next_node; //인접노드
        int v; //인접노드와의 거리

        public Edge(int next_node, int v) {
            this.next_node = next_node;
            this.v = v;
        }
    }
}
