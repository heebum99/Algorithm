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
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); //건물 종류 수
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int[] indegree = new int[N + 1];
        int[] selfBuild = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            selfBuild[i] = Integer.parseInt(st.nextToken());
            while (true) {
                int preBuild = Integer.parseInt(st.nextToken());
                if (preBuild == -1) {
                    break;
                }
                arr.get(preBuild).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[N + 1];
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : arr.get(now)) {
                indegree[next]--;
                //건물들이 동시에 여러개 지어질 수 있으므로 최대값을 선택
                result[next] = Math.max(result[next], result[now] + selfBuild[now]);
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(result[i] + selfBuild[i]);
        }


        //실패
        /*for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens();
            for (int j = 0; j < cnt; j++) {
                int inputNum = Integer.parseInt(st.nextToken());
                if (inputNum == -1) {
                    break;
                }
                arr.get(i).add(inputNum);
                if (j != 0) {
                    indegree[inputNum]++;
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                sb.append(arr.get(i).get(0)).append("\n");
            }
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int time = 0;
            for (int next : arr.get(now)) {
                indegree[next]--;
                time += arr.get(now).get(0);
                if (indegree[next] == 0) {
                    queue.offer(next);
                    sb.append(time).append("\n");
                }
            }
        }
        System.out.print(sb);*/
    }
}
