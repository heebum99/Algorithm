import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] knowTruthPerson;
    static int[] parent;
    static ArrayList<Integer>[] party;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //유니온 파인드 알고리즘으로 풀기
        int N = Integer.parseInt(st.nextToken()); //사람 수
        int M = Integer.parseInt(st.nextToken()); //파티 수

        st = new StringTokenizer(br.readLine());
        int knowTruthCnt = Integer.parseInt(st.nextToken());
        knowTruthPerson = new int[knowTruthCnt]; //진실을 아는 사람 저장
        if (st.hasMoreTokens()) {
            for (int i = 0; i < knowTruthCnt; i++) {
                int num = Integer.parseInt(st.nextToken());
                knowTruthPerson[i] = num;
            }
        }

        party = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            party[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int party_size = Integer.parseInt(st.nextToken());
            for (int j = 0; j < party_size; j++) {
                party[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int firstP = party[i].get(0);
            for (int j = 1; j < party[i].size(); j++) {
                union(firstP, party[i].get(j));
            }
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            boolean isPossible = true;
            int num = party[i].get(0);
            for (int j = 0; j < knowTruthCnt; j++) {
                if (find(num) == find(knowTruthPerson[j])) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                answer++;
            }
        }
        System.out.println(answer);
    }


    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    static int find(int a) {
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = find(parent[a]);
    }
}
