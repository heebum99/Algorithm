import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static PriorityQueue<Integer>[] distQueue;
    static PriorityQueue<City> queue;
    static int[][] W = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //도시 수
        int M = Integer.parseInt(st.nextToken()); //도로 수
        int K = Integer.parseInt(st.nextToken()); //원하는 K번째 최단 경로

        distQueue = new PriorityQueue[N + 1];
        for (int i = 0; i <= N; i++) {
            distQueue[i] = new PriorityQueue<>(K, Collections.reverseOrder()); //K 크기의 우선 순위 큐 설정, 내림차순 정렬
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            W[start][end] = time;
        }

        queue = new PriorityQueue<>();
        queue.offer(new City(1, 0));
        distQueue[1].offer(0);
        while (!queue.isEmpty()) {
            City now = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (W[now.targetCity][i] != 0) {
                    if (distQueue[i].size() < K) { //저장 경로 개수가 K개가 되지않으면 무조건 추가
                        distQueue[i].offer(now.time + W[now.targetCity][i]);
                        queue.offer(new City(i, now.time + W[now.targetCity][i]));
                    } else if (distQueue[i].peek() > now.time + W[now.targetCity][i]) { //저장된 경로가 K개일때, 우선순위 큐 안에 들어있는 최대 값보다 현재 값이 작을때만 추가
                        distQueue[i].poll(); //기존 큐 최대 값 삭제
                        distQueue[i].offer(now.time + W[now.targetCity][i]);
                        queue.offer(new City(i, now.time + W[now.targetCity][i]));
                    }
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            if (distQueue[i].size() == K) {
                System.out.println(distQueue[i].peek());
            } else {
                System.out.println(-1);
            }
        }
    }

    private static class City implements Comparable<City> {
        int targetCity;
        int time;

        public City(int targetCity, int time) {
            this.targetCity = targetCity;
            this.time = time;
        }

        @Override
        public int compareTo(City o) { //오름차순 정렬
            return this.time - o.time;
        }
    }
}
