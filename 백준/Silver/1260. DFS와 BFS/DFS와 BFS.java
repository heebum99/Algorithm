import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//정점의 개수
        int M = Integer.parseInt(st.nextToken());//간선의 개수
        int V = Integer.parseInt(st.nextToken());//탐색을 시작할 정점의 번호
        arr = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            arr[num1].add(num2);
            arr[num2].add(num1);
        }

        for (int i = 1; i <= N; i++) { //작은 노드부터 접근하기 위해 오름차순 정렬 수행
            Collections.sort(arr[i]);
        }

        visited = new boolean[N + 1];
        DFS(V); //깊이우선탐색
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V); //너비우선탐색
        System.out.println();
    }

    private static void BFS(int v) { //BFS 구현
        //BFS는 큐로 구현
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int Node = queue.poll();
            System.out.print(Node + " ");
            for (int i : arr[Node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int v) { //DFS 구현
        System.out.print(v + " ");
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : arr[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

}
