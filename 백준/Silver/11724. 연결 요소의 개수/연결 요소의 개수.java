import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr; //리스트 배열
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        //깊이 우선 탐색 DFS 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //노드 개수
        int M = Integer.parseInt(st.nextToken()); //에지 개수

        arr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < arr.length; i++) { //인접 리스트 초기화
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            //방향이 없는 에지이므로 양쪽 다 추가
            arr[start].add(end);
            arr[end].add(start);
        }

        int count = 0; //DFS 횟수 측정 => 연결 요소 개수
        for (int i = 1; i < arr.length; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        
        System.out.println(count);
        br.close();
    }

    private static void DFS(int v) {
        if (visited[v]) { //방문한 노드면 종료
            return;
        }

        visited[v] = true;
        for (int i : arr[v]) {
            if(!visited[i]){ //방문하지 않은 노드에 대해서
                //재귀 호출
                DFS(i);
            }
        }

    }
}
