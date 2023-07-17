import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //도시 개수
        int M = Integer.parseInt(br.readLine()); //도로 개수
        ArrayList<ArrayList<Node>> arr = new ArrayList<>(); //인접리스트 생성
        ArrayList<ArrayList<Node>> reverseArr = new ArrayList<>(); //역방향 인접리스트 생성

        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
            reverseArr.add(new ArrayList<>());
        }

        int[] indegree = new int[N + 1]; //진입 차수 배열

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            arr.get(start).add(new Node(end, time));
            reverseArr.get(end).add(new Node(start, time));
            indegree[end]++;
        }

        st = new StringTokenizer(br.readLine());
        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());

        //위상 정렬
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startCity);
        int[] result = new int[N + 1];
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Node next : arr.get(now)) {
                indegree[next.targetNode]--;
                result[next.targetNode] = Math.max(result[next.targetNode], result[now] + next.time);
                if (indegree[next.targetNode] == 0) {
                    queue.offer(next.targetNode);
                }
            }
        }

        int cnt = 0;
        boolean[] visited = new boolean[N + 1];
        queue = new LinkedList<>();
        queue.offer(endCity);
        visited[endCity] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Node next : reverseArr.get(now)) {
                //1분도 쉬지않는 도로 체크
                if (result[next.targetNode] + next.time == result[now]) {
                    cnt++;
                    if (!visited[next.targetNode]) {
                        visited[next.targetNode] = true;
                        queue.offer(next.targetNode);
                    }
                }
            }
        }
        System.out.println(result[endCity]);
        System.out.println(cnt);
    }

    static class Node {
        int targetNode;
        int time;

        public Node(int targetNode, int time) {
            this.targetNode = targetNode;
            this.time = time;
        }
    }
}
