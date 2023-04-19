import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //상하좌우 탬색하기 위한 배열 선언
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] arr;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); //행 개수
        M = Integer.parseInt(st.nextToken()); //열 개수

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 0; j < M; j++) {
//                arr[i][j] = Integer.parseInt(input.substring(j, j + 1));
                arr[i][j] = input.charAt(j) - '0';
            }
        }
        BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);

    }

    private static void BFS(int i, int j) { //BFS 구현
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) { //좌표 유효성 검사
                    if (arr[x][y] != 0 && !visited[x][y]) { //1이면서 방문하지 않은 칸인 경우 이동
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1; //깊이 업데이트
                        queue.offer(new int[]{x, y});
                    }
                }
            }
        }
    }
}
