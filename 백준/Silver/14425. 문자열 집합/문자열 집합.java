import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            hm.put(br.readLine(), 1);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            String key = br.readLine();
            if (hm.getOrDefault(key, 0) > 0) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
