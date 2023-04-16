import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited; //방문 여부
    static ArrayList<Integer>[] arr; //인접 리스트

    static int ans = 0;

    public static void main(String[] args) throws IOException {
        //깊이우선탐색 DFS 이용
        //깊이가 5라면 1을 아니면 0을 리턴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //사람(노드) 수
        int M = Integer.parseInt(st.nextToken()); //관계(에지) 수

        arr = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end);
            arr[end].add(start);
        }

        for (int i = 0; i < N; i++) {
            if (ans == 0) {
                DFS(i, 1);
            } else {
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(0);

        br.close();
    }

    private static void DFS(int num, int depth) {
        if (depth == 5) { //깊이가 5라면 DFS 종료.
            ans = 1;
            return;
        }

        visited[num] = true;
        for (int i : arr[num]) {
            if (!visited[i]) { //재귀 호출마다 깊이가 1증가
                DFS(i, depth + 1);
            }
        }
        visited[num] = false; //깊이가 5인 경우를 찾을때까지 반복하기 위해서 방문여부를 false
    }
}
