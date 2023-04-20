import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //투 포인터 방식으로 구현
        long[] arr1 = new long[N];
        long[] arr2 = new long[M];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Long.parseLong(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0; //포인터
        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) {
                sb.append(arr1[p1++] + " ");
            } else {
                sb.append(arr2[p2++] + " ");
            }
        }
        while (p1 < N) {
            sb.append(arr1[p1++] + " ");
        }
        while (p2 < M) {
            sb.append(arr2[p2++] + " ");
        }

        System.out.println(sb);
        //우선 순위 큐 시간 초과
        /*PriorityQueue<Long> queue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            queue.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            queue.add(Long.parseLong(st.nextToken()));
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }*/
        br.close();
    }
}
