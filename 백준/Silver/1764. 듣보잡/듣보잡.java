import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < N + M; i++) {
            String input = br.readLine();
            hm.put(input, hm.getOrDefault(input, 0) + 1);
        }

        int count = 0; //듣보잡 수
        StringBuilder sb = new StringBuilder();

        //키값으로 오름차순 정렬
        List<String> keySet = new ArrayList<>(hm.keySet());
        Collections.sort(keySet);

        for (String s : keySet) {
            if (hm.get(s) >= 2) {
                count++;
                sb.append(s).append("\n");
            }
        }
        System.out.println(count);
        System.out.print(sb);

        br.close();
    }
}
