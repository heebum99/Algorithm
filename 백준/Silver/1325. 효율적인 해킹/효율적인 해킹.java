import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] visitedCnt; //방문 횟수 = 신뢰 정도
    static boolean[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()); // 컴퓨터 개수(노드 수)
        int M = Integer.parseInt(st.nextToken()); // 신뢰관계 개수(에지 수)

        arr = new ArrayList[N + 1];
        visitedCnt = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end);
        }

        for (int i = 1; i <= N; i++) { //모든 노드로 BFS 실행
            visited = new boolean[N + 1];
            BFS(i);
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(visitedCnt[i], max);
        }

        for (int i = 1; i <= N; i++) {
            if (max == visitedCnt[i]) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }

    private static void BFS(int i) { //너비우선탐색 BFS 알고리즘
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            for (int node : arr[now_node]) {
                if (!visited[node]) {
                    visited[node] = true;
                    visitedCnt[node]++;
                    queue.add(node);
                }
            }
        }
    }
}
