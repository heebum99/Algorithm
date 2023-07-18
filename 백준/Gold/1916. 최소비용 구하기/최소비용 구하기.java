import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static PriorityQueue<BusInf> q;
    static int[] result;
    static ArrayList<BusInf>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //도시 수
        int M = Integer.parseInt(br.readLine()); //버스 수
        visited = new boolean[N + 1];
        result = new int[N + 1];
        Arrays.fill(result, Integer.MAX_VALUE);

        arr = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[start].add(new BusInf(end, cost));
        }

        st = new StringTokenizer(br.readLine());
        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());
        result[startCity] = 0;
        
        q = new PriorityQueue<>();
        q.offer(new BusInf(startCity, 0));
        while (!q.isEmpty()) {
            BusInf now = q.poll();
            if (visited[now.targetCity]) {
                continue;
            }
            visited[now.targetCity] = true;
            for (BusInf next : arr[now.targetCity]) {
                if (result[next.targetCity] > result[now.targetCity] + next.cost) {
                    result[next.targetCity] = result[now.targetCity] + next.cost;
                    q.offer(new BusInf(next.targetCity, result[next.targetCity]));
                }
            }
        }
        System.out.println(result[endCity]);
    }

    static class BusInf implements Comparable<BusInf> {
        int targetCity;
        int cost;

        public BusInf(int targetCity, int cost) {
            this.targetCity = targetCity;
            this.cost = cost;
        }

        @Override
        public int compareTo(BusInf o) {
            return this.cost - o.cost;
        }
    }
}
