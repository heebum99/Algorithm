import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pos {
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    static int N, min; //N = 지도 크기, min = 가장 작은 복구 경로 시간
    static boolean[][] visited; //방문 배열
    static int[][] map, sum; //map = 단일 복구 시간, sum = 누적 경로 복구 시간합
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static String s;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            N = sc.nextInt();
            visited = new boolean[N][N];
            map = new int[N][N];
            sum = new int[N][N];

            for (int j = 0; j < N; j++) {
                s = sc.next();
                for (int k = 0; k < N; k++) {
                    map[j][k] = s.charAt(k) - '0';
                }
            }

            min = Integer.MAX_VALUE;

            bfs(0, 0);
            System.out.println("#" + (++num) + " " + min);
        }

        sc.close();
    }

    static void bfs(int x, int y) {
        Queue<Pos> queue = new LinkedList<>();

        queue.offer(new Pos(x, y));
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            Pos p = queue.poll();
            int now_x = p.x;
            int now_y = p.y;

            //도착지인 우측최하단에 도착한 경우
            //최솟값과 비교 후 더 작은 값을 정답으로 선택
            if (now_x == N - 1 && now_y == N - 1) {
                min = Math.min(min, sum[N - 1][N - 1]);
                continue;
            }

            //최솟값보다 누적합이 크면 굳이 탐색할 필요가 없음.
            if (min <= sum[now_y][now_x]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now_x + dx[i];
                int ny = now_y + dy[i];

                if (nx < 0 || nx >= N || ny >= N || ny < 0) {
                    continue;
                }

                if (!visited[ny][nx] || sum[ny][nx] > sum[now_y][now_x] + map[now_y][now_x]) {
                    visited[ny][nx] = true;
                    sum[ny][nx] = sum[now_y][now_x] + map[now_y][now_x];
                    queue.offer(new Pos(nx, ny));
                }
            }
        }
    }
}