import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static Edge[] edge;
    static long[] cityMoney, earnMoney;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //도시 수
        int startCity = Integer.parseInt(st.nextToken()); //출발 도시 번호
        int endCity = Integer.parseInt(st.nextToken()); //도착 도시 번호
        int M = Integer.parseInt(st.nextToken()); //교통수단 개수
        cityMoney = new long[N];
        earnMoney = new long[N];
        Arrays.fill(earnMoney, Long.MIN_VALUE);

        edge = new Edge[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edge[i] = new Edge(start, end, cost);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cityMoney[i] = Long.parseLong(st.nextToken());
        }

        earnMoney[startCity] = cityMoney[startCity]; //변형된 벨만-포드 알고리즘 수행
        //양수 사이클이 찾아질수 있도록 충분히 큰 수로 반복
        for (int i = 0; i <= N + 50; i++) {
            for (int j = 0; j < M; j++) {
                int start = edge[j].start;
                int end = edge[j].end;
                int cost = edge[j].cost;

                //출발 노드가 방문하지 않은 노드면 skip
                if (earnMoney[start] == Long.MIN_VALUE) {
                    continue;
                } else if (earnMoney[start] == Long.MAX_VALUE) { //출발 노드가 양수 사이클에 연결된 노드라면 종료 노드도 연결 노드로 업데이트
                    earnMoney[end] = Long.MAX_VALUE;
                } else if (earnMoney[end] < earnMoney[start] + cityMoney[end] - cost) { //더 많은 돈을 벌 수 있는 새로운 경로 발견 시 새로운 경로값으로 업데이트
                    earnMoney[end] = earnMoney[start] + cityMoney[end] - cost;
                    if (i >= N - 1) { //N-1 반복 이후 업데이트 되는 종료 노드는 양수 사이클 연결 노드로 업데이트
                        earnMoney[end] = Long.MAX_VALUE;
                    }
                }
            }
        }
        if (earnMoney[endCity] == Long.MAX_VALUE) { //돈을 무한히 벌 수 있는 경우
            System.out.println("Gee");
        } else if (earnMoney[endCity] == Long.MIN_VALUE) { //도착 불가능
            System.out.println("gg");
        } else { //이외의 경우
            System.out.println(earnMoney[endCity]);
        }
    }

    static class Edge {
        int start; //출발 도시
        int end; //도착 도시
        int cost; //교통수단 비용

        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
    }
}
