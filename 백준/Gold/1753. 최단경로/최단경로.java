import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Node>[] arr;
    static PriorityQueue<Node> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int startV = Integer.parseInt(br.readLine());

        arr = new ArrayList[V + 1]; //노드를 저장하는 인접리스트
        for (int i = 1; i <= V; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            arr[start].add(new Node(end, weight));
        }

        distance = new int[V + 1]; //거리를 저장하는 배열
        visited = new boolean[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startV] = 0;
        q.offer(new Node(startV, 0));
        while (!q.isEmpty()) {
            Node now = q.poll();
            int nowNode = now.targetNode;
            if (visited[nowNode]) {
                continue;
            }
            visited[nowNode] = true;
            for (int i = 0; i < arr[nowNode].size(); i++) {
                Node tmp = arr[nowNode].get(i);
                int next = tmp.targetNode;
                int weight = tmp.weight;
                if (distance[next] > distance[nowNode] + weight) {
                    distance[next] = distance[nowNode] + weight;
                    q.add(new Node(next, distance[next]));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (visited[i]) {
                System.out.println(distance[i]);
            } else {
                System.out.println("INF");
            }
        }
    }

    private static class Node implements Comparable<Node> {
        int targetNode;
        int weight;

        public Node(int targetNode, int weight) {
            this.targetNode = targetNode;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
}
