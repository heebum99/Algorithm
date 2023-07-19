import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static Edge[] edges;
    static long[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //도시 개수
        int M = Integer.parseInt(st.nextToken()); //버스 개수

        edges = new Edge[M];
        distance = new long[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(start, end, time);
        }

        //벨만-포드 알고리즘
        distance[1] = 0; //출발 노드 거리는 0으로 설정
        for (int i = 1; i < N; i++) { //N(노드 수)보다 1개 적은 수만큼 반복
            for (int j = 0; j < M; j++) {
                Edge edge = edges[j];
                // 더 작은 최단거리가 있을때만 업데이트하기
                if (distance[edge.start] != Integer.MAX_VALUE &&
                        distance[edge.end] > distance[edge.start] + edge.time) {
                    distance[edge.end] = distance[edge.start] + edge.time;
                }
            }
        }

        boolean hasCycle = false; //음수 싸이클 여부 확인
        for (int i = 0; i < M; i++) {
            Edge edge = edges[i];
            //더 작은 최단 경로가 존재할 경우 음수 싸이클 존재
            if (distance[edge.start] != Integer.MAX_VALUE &&
                    distance[edge.end] > distance[edge.start] + edge.time) {
                hasCycle = true;
            }
        }

        if (!hasCycle) { //음수 싸이클이 없을 때
            for (int i = 2; i <= N; i++) {
                if (distance[i] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                } else {
                    System.out.println(distance[i]);
                }
            }
        } else { //음수 싸이클이 존재
            System.out.println(-1);
        }
    }

    private static class Edge {
        int start, end, time;

        public Edge(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }
}
