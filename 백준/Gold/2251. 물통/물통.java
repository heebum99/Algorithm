import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited; //A,B 무게를 알면 C무게는 알 수 있음.
    static int[] sender = {0, 0, 1, 1, 2, 2};
    static int[] receiver = {1, 2, 0, 2, 0, 1};
    static boolean[] answer;
    static int[] now;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        now = new int[3]; //A,B,C의 최대 소유할 수 있는 물의 양
        now[0] = Integer.parseInt(st.nextToken());
        now[1] = Integer.parseInt(st.nextToken());
        now[2] = Integer.parseInt(st.nextToken());

        visited = new boolean[201][201];
        answer = new boolean[201];

        BFS();

        for (int i = 0; i <= 200; i++) {
            if (answer[i]) {
                System.out.print(i + " ");
            }
        }
    }

    private static void BFS() {
        Queue<AB> queue = new LinkedList<>();
        queue.add(new AB(0, 0));
        visited[0][0] = true;
        answer[now[2]] = true;

        while (!queue.isEmpty()) {
            AB ab = queue.poll();
            int A = ab.A;
            int B = ab.B;
            int C = now[2] - A - B;

            for (int i = 0; i < 6; i++) { //A->B, A->C, B->A, B->C, C->A, C->B => 물을 주고 받는 경우의 수
                int[] next = {A, B, C}; //A,B,C가 가지고 있는 물의 양
                next[receiver[i]] += next[sender[i]];
                next[sender[i]] = 0;

                if (next[receiver[i]] > now[receiver[i]]) { //물이 넘치는 경우 => 초과하는 물의 양 만큼을 다시 돌려줌
                    next[sender[i]] = next[receiver[i]] - now[receiver[i]];
                    next[receiver[i]] = now[receiver[i]];
                }

                if (!visited[next[0]][next[1]]) {
                    visited[next[0]][next[1]] = true;
                    queue.add(new AB(next[0], next[1]));
                    if (next[0] == 0) { //A의 물의 양이 0일때 C의 값 저장
                        answer[next[2]] = true;
                    }
                }
            }
        }
    }

    private static class AB {
        int A;
        int B;

        public AB(int a, int b) {
            A = a;
            B = b;
        }
    }
}
